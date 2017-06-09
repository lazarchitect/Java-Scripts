import java.util.Scanner;
public class randomizer{
	public static void main(String [] args) throws InterruptedException {
	double z=0;

	Scanner scan = new Scanner(System.in);
	Scanner scann = new Scanner(System.in);
	Scanner scannn = new Scanner(System.in);
	
	Scanner one = new Scanner(System.in);
	Scanner two = new Scanner(System.in);

	System.out.println("This program will give you a random number between any 2 limits you set.");
	/*String ed="";
	while(!ed.equals("hello")){*/

		System.out.println("What should the lower limit be?");
		double x = scan.nextDouble();
		System.out.println("And what should the upper limit be?");
		double y = scann.nextDouble();

		while(y<x){
			System.out.println("upper limit cannot be lower than lower limit. Start over.");
			System.out.println("What should the lower limit be?");
			x = scan.nextDouble();
			System.out.println("And what should the upper limit be?");
			y = scann.nextDouble();		
		}

		System.out.println("do you want the number to have a fractional component? if not, it'll be an integer. TRUE FOR YES, FALSE FOR NO");
		boolean qwer = scannn.nextBoolean();
			
		
			z= (double)((Math.random()*100)+x);

			/*System.out.print("Calculating");
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(900);
			System.out.print(".");
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(800);
			System.out.print(".");
			Thread.sleep(200);
			System.out.print(".");*/	

			while (z>y){
				z=(double)((Math.random()*100)+x);
			}
			int intAnswer = (int)(z);

			if (qwer==true) {
				System.out.print(" And your random number is... " + z + "!");

			}
			else{
				System.out.print(" And your random number is... " + intAnswer + "!");

			}
			/*System.out.println("<a> to go again with the same limits, <b> to go agan with different limits, <c> to quit.");
			String a = one.nextLine();
			switch(a){
				case "a":ed="";
				case "b":ed="yes";
				default: return;
			}
		}//end while
	}*/

	}
}	//so negatives and doubles work. issues arise when extreme specification is called for, like finding a random value between 56.901 and 56.904. Must find a solution.
	//also, make it so the decimal tapers off after a certain amount of precision?