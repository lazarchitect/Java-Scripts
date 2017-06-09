import java.util.Scanner;
public class fibonacci{
	public static void main(String [] args){
		System.out.println("This program prints out the famous Fibonacci Sequence. How many indexes should it have?");
		Scanner one = new Scanner (System.in);//initialize the input taker.

		double a = one.nextInt(); //take input

		/*while (a<0) {	//error loop
			System.out.print("Greater than 0, hero. C'mon, you knew that.");
			a = one.nextInt();
		}*/

		double first=0, next=1, sum=first+next,tempFirst=first;
		System.out.print("0...    ");
		for (int i=1; i<=a; i++){

			tempFirst = first;
			first=next;
			sum=sum+next;
			next=next+tempFirst;



			if (first<2000000000){
				System.out.print((int)(first)+"...    ");
			}
			else{
				System.out.print(first+"...    ");
			}



		}
		//System.out.print(sum);


	}




/*	public static int fib(int n){
		if(n==0 || n==1){
			return n;
		}
		return fib (n-1)+fib(n-2);
	}
	public static void main(String [] args){
		int n = IO.readInt();
		System.out.print (fib(n));
	}*/
}