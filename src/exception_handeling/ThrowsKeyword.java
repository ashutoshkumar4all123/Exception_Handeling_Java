package exception_handeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite{
	void readFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("d:/abc.txt");
	}
	void saveFile() throws FileNotFoundException {
		
		String test = "This i demo";
		FileOutputStream fs= new FileOutputStream("d:/xyz.txt");
	}
}


public class ThrowsKeyword {

	public static void main(String[] args) throws FileNotFoundException {
		ReadAndWrite rw = new ReadAndWrite();
//		rw.readFile();
		try 
		{
			rw.readFile();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		try 
		{
			rw.saveFile();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}		
		System.out.println("Hello");

	}
	

}
