package exceptions;

public class AuthenticationException extends Exception{

	public AuthenticationException(){
		super("Wrong credentials");
	}

	public AuthenticationException(String message){
		super(message);
	}
}
