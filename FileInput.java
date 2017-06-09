import java.util.Scanner;
import java.io.*;

public class scan{
	
	public static void main(String[] args){
		
		Scanner scan;
		File inFile = new File("Lab3.txt");
		
		System.out.println("Opening and reading file");
		
		try{
			scan = new Scanner(inFile);
			
			while(scan.hasNext()){
				System.out.println(scan.nextLine());
			} // end while
		
			scan.close();
			
		} // end try
		
		catch (FileNotFoundException e){
			System.out.println(e);
			System.exit(1);		// IO error; exit program
		} // end catch	
			
		System.out.println("end of program");
	}
}
