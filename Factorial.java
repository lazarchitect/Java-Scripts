import java.util.Scanner;
public class Factorial{
	public static void main(String [] args){

	System.out.println ("give me an positive integer to factorialize");
	Scanner one = new Scanner (System.in);
	double x = one.nextInt();
	double total = 1.0;

	while (x<0){
		System.out.println("cant be negative, chief. try again.");
		x=one.nextInt();
	}

	if (x!=0){
		for (int i = 1; i<=x; i++){
			total*=i;
		}
	}

	System.out.print ("the factorial is " + total+".");
	}
}