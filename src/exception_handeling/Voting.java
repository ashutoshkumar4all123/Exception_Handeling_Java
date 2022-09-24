package exception_handeling;

import java.util.Scanner;

class YoungerAgeException extends RuntimeException{
	YoungerAgeException(String msg){
		super(msg);
	}
}

public class Voting {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter your age:  ");
		int age = s.nextInt();
		
		try {
			if (age < 18) {
				throw new YoungerAgeException("You are not eligible for vote");
			} else {
				System.out.println("You are eligible for vote1");
			}
		} catch (YoungerAgeException e) {

			e.printStackTrace();
		}
		System.out.println("Hello");
	}

}
