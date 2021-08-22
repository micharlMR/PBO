package ExceptionExcerice;

// Program java untuk mendemonstraikan exception dilempar
// bagaimana sistem run-time mencari call stacj
// untuk mencari penanganan exception yg sesuai
public class ExceptionThrown {
	// Melempar Exception(Arithmetc Exception)
	// Appropriate Exception handler is not found within this method
	static int divideByZero(int a, int b){
		// Statement ini akan menyebabkan ArithmeticException(/ oleh nol)
		int i = a/b;
		return i;
	}

	// Sistem run time mencari penanganan exception yang sesuai
	// dalam method ini juga teteapi tidak bisa ditemukan. Jadi melihat kedepan
	// pada call stack.
	static int computeDivision(int a, int b){
		int res = 0;
		try{
			res = divideByZero(a,b);
		}
		//tidak sesuai dengan AritmethicException
		catch(NumberFormatException ex){
			System.out.println("NumberFormatException is occured");
		}
		return res;
	}

	// Dalam method ini mencari Exception handler yang sesuai
	// yaitu mencocokan blok catch.
	public static void main(String args[]){
		int a = 5;
		int b = 2;
		try{
			int i = computeDivision(a,b);
			System.out.println("Masuk gan " + i);
		}
		// sesuai ArithmethicException
		catch(ArithmeticException ex){
			// getMessage akan mem-print deskripsi exception(ini / oleh nol)
			System.out.println(ex.getMessage());
		}
	}


}
