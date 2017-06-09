import java.util.Scanner;
import java.io.*;
public class FWDriver{
	public static void main(String[] args){
		FileWriter writer = null;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Where should the file go? Put a slash at the end.\nC:/Users/Eddie/");
		String path = "C:/Users/Eddie/"+scan.nextLine();
		System.out.println("What should it be called?");
		String name = scan.nextLine();
		System.out.println("What type is it?");
		String type = scan.nextLine();
		
		try{
			writer = new FileWriter(path, name, type);
		}
		catch(FileNotFoundException e){
			System.out.println("this line should never happen.");
		}
		catch(UnsupportedEncodingException e){
			System.out.println("I dont plan on ever letting this line of code happen either. If you can see this message, ya dun goofed or I am a very experienced programmer now.");
		}
		// catch(Exception e){
		// 	System.out.println("Bad input. Try again.");
		// }
		
		System.out.println("Enter a terminator that will end your input when you type it in later.");
		String terminator = scan.nextLine();
		
		System.out.println("Now begins the input. Enter each line separately.");
		
		while(true){
			System.out.print(">>> ");
			String input = scan.nextLine();
			if(input.equals(terminator)) break;
			writer.output(input);
		}
		System.out.println("done!");
		writer.file.close();
	}
}	