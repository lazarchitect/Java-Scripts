import java.util.Scanner;
public class inputOperator{
	public static void main(String [] args){

	boolean printFinal=false;
	double y =1;
	System.out.println("This program will do whatever you tell it with 2 numbers you give it.");

	Scanner scan =new Scanner(System.in);
	System.out.println("Input any number! A NUMBER. If anything else, you'll crash the program.");
	double var1 = scan.nextDouble();

	System.out.println("Another one! Again a NUMBER.");
	double var2 = scan.nextDouble();

	System.out.println("what operator? 1 for add, 2 for subtract, 3 for multiply, 4 for divide. 5 for exponentiate, 6 for tetrate(experimental).");
	int operator = scan.nextInt();

	if (operator==1){//add
		y=var1+var2;
		printFinal=true;
	}
	else if (operator==2) {//subtract
		y=var1-var2;
		printFinal=true;
	}
	else if (operator==3) {//multiply
		y=var1*var2;
		printFinal=true;
	}
	else if (operator==4) {//divide
		if (var2 !=0){
			y=var1/var2;
			printFinal=true;
		}
		else{
			if (var1==4){
				System.out.println("ERROR 404 QUOTIENT NOT FOUND");
				System.out.println("my first easter egg. im funny I swear");
			}
			else {
				System.out.println("Undefined answer. Divide by zero error.");
			}

		}	//lol 404 error
	}
	else if (operator==5) {//exponentiate
		double i=var2;
		if (var2==0){
			y=1;
			printFinal=true;
		}
		else{
			for (i=var2; i>0; i--){
				y=y*var1;
				printFinal=true;
			}//	DOESNT WORK FOR NEGATIVE EXPONENTS. SEEMS FINE OTHERWISE.
		}
	}

	/*Tetrate sign: ^^
	Here's how tetrate works. What tetration is is repeated exponentiation. Where 5^5 is 5*5*5*5*5, or 3125, 5^^5 is 5^5^5^5^5, or ~7e436. YEAH. okay. seems right. now, to get started, we're going to want to raise to a power multiple times. let's see...
	what we want is var1^var1^var1... var2-many times.
			so 3^^5 is 3*3*3*3*3. 2^^2 is still 2*2. lol.
	*/
	//WRITTEN 8/6/14		
	else if (operator==6){
		printFinal = true;
		y=var1;
		if(var2>0){
			y=Math.pow(var1,var1);
			while(var2-1>0){
				y = Math.pow(y, var1);
				var2--;
			}
		}
	}
	else {
		System.out.println("You had to pick 1-6, dummy.");
	}

	if (printFinal==true){
		System.out.println("Your answer: "+y);
	}

	}//method
}//class