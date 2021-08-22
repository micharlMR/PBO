package tugas;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;
import exceptions.ExcessiveFailedLoginException;
import exceptions.InvalidPropertyException;

public class User {
	private String firstName;
	private String lastName;
	private Character gender;
	private String address;
	private String userName;
	private String password;
	private MessageDigest digest;

	private static final int maxLoginAttemps = 3;
	private static int loginAttemps = 0;

	private String hash(String strToHash){
		try{
			digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(strToHash.getBytes(StandardCharsets.UTF_8));
			return DatatypeConverter.printHexBinary(hash);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return "";
	}
	
	public User(String firstName, String lastName, Character gender, String address, String userName, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.address = address;
		this.userName = userName;
		this.password = hash(password);
	}
	

	public boolean login(String username, String password) throws ExcessiveFailedLoginException{
		if(this.userName.equals(username)) {
			System.out.println(this.password + " " + hash(password));
			if(loginAttemps == maxLoginAttemps) {
				loginAttemps++;
				throw new ExcessiveFailedLoginException();
			}
			else if(loginAttemps > maxLoginAttemps) {
				throw new ExcessiveFailedLoginException("Anda telah mencapai batas login");
			}
			
			if(this.password.equals(hash(password))) {
				loginAttemps = 0;
				return true;
			}
			else {
				loginAttemps++;
				throw new ExcessiveFailedLoginException("user/pass salah");
			}
		}
		
		return false;
	}
	
	public String greeting() {
		String greet = "Selamat Datang ";
		switch(gender) {
		case 'M' : greet+="Tuan ";break;
		case 'F' : greet+="Nona ";break;
		}
		greet += this.firstName + " " + this.lastName;
		
		return greet;
	}
	
	public String getUserName() {
		return userName;
	}
}
