public class fibonaccier{
	public static void main(String [] args){

		System.out.println("This program finds the sum of the first 400 Fibonacci numbers");

		double first=0, next=1, sum=first+next,tempFirst=first;

		int i=0; double total=1;

		while(i<=400){

			tempFirst = first;

			first=next;

			sum=sum+next;

			next=next+tempFirst;

			total*=first;

			i++;

		}//end while

		System.out.println(total);

	}//end main

}//end class