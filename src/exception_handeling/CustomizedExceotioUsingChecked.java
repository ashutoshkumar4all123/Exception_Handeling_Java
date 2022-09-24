package exception_handeling;



class UnderAgeException extends Exception{
    UnderAgeException() {
		super("You are under age");
	}
    UnderAgeException(String massage) {
		super(massage);
	}
	
}
public class CustomizedExceotioUsingChecked {

	public static void main(String[] args)  {
		int age=17;
		try {
		if (age<18) {
			throw new UnderAgeException();
		}else {
			System.out.println("eligible forr voting");
		}
		}catch(UnderAgeException e) {
			e.printStackTrace();
		}
		
		System.out.println("Hello");
	}

}
