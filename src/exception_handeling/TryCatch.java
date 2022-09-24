package exception_handeling;

import java.io.FileInputStream;

public class TryCatch {

	public static void main(String[] args) {
//		try {
//				FileInputStream fis=new FileInputStream("d:/abc.txt");
//		}
//		catch(Exception e){
//     		System.out.println(e);
//	    }
//		System.out.println("hello");
		
//		try {
//			Class.forName("com.mysql.jdbc.driver");
//	    }
//	    catch(Exception e){
// 		    System.out.println(e);
//       }
//	    System.out.println("hello");
//		System.out.println(1);
//		try {
//			System.out.println(2);
//			int a=100,b=0,c;
//			System.out.println(3);
//			c=a/b;
//			System.out.println(4);
//			System.out.println(c);
//			System.out.println(5);
//	    }
//	    catch(ArithmeticException e){
//	    	System.out.println(6);
// 		    System.out.println(" you can not divide by zero");
// 		    System.out.println(7);
//       }
//	    System.out.println("hello");
		
//		try {
//			int a=100, b=0,c;
//			c=a/b;
//			System.out.println(c);
//		}
//		catch(ArithmeticException ae) {
//			//Exception name,discription,stacktrce
//			//ae.printStackTrace();
//			
//			//it print only exception name and discription 
//			System.out.println(ae);
//			System.out.println(ae.toString());
//			
//			//it will print only discrption
//			System.out.println(ae.getMessage());
//			
//		}
		
		try {
			int a=100, b=0,c;
			c=a/b;
			System.out.println(c);
			
		}catch(Exception e) {
			System.out.println(e);
			
		}finally {
			System.out.println("I am in finally block");
		}
		System.out.println("hello");

	}

}
