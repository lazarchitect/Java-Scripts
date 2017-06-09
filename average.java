import java.util.Scanner;
public class average{
	public static void main(String [] args){

	System.out.println("This program will find the average of a bunch of numbers you input.");
	Scanner one = new Scanner(System.in);
	Scanner two = new Scanner(System.in); 
	Scanner three = new Scanner(System.in);
	int quit = one.nextInt();
	int i = 0, x=0;
	String s = "no",a="no";
	while(!(a.toLowerCase().equals("yes"))){
		while (!(s.toLowerCase().equals("quit"))){
			System.out.println("Enter another.");
			x+=quit;
			quit = one.nextInt();
			i++;
			System.out.println("Type \"quit\" to stop the program, or type anything else to keep going.");
			s = two.nextLine();
		}
	System.out.println("Are you sure you want to quit?");
	a = three.nextLine();
	}


	System.out.print((double)(x/i));
	}
}