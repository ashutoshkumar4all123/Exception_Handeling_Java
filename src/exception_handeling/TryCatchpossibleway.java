package exception_handeling;

public class TryCatchpossibleway {

	public static void main(String[] args) {
//		finally {
//			
//		}
	TryCatchpossibleway t= new TryCatchpossibleway();
		try{
			t.divide();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	   System.out.println("hello");
	}
	
	void divide() {
		
//		try {
//		int a=100,b=0,c;
//		c=a/b;
//		System.out.println(c);
//		}catch(Exception e) {
//			System.out.println(e);
//		}
		
		int a=100,b=0,c;
		c=a/b;
		System.out.println(c);
	}

}
