import java.util.Scanner;
public class bubbler{
	public static void main(String [] args){

	System.out.print("This program will take an array input from you and sort in numerically. First, enter the number of items the array should have: ");

	Scanner one = new Scanner(System.in);
	int a = one.nextInt();
	while(a<0){
		System.out.println("not valid, cant be negative. try again.");
		a = one.nextInt();
	}
	///////////////////////////////////////////////////////////////////////////////////////////////
	double [] arr = new double [a];
	System.out.println("Okay, now enter each item in the array separately.");
	for (int i=0; i<a; i++){
		arr[i] = one.nextDouble();
	}
	///////////////////////////////////////////////////////////////////////////////////////////////
	double temp;
	System.out.println("Now begins the sorting.");//compare first and second values. <, do nothing. >, switch em. repeat. when you get to the end, start again with outer loop and outer loop+1, OL+1 and OL+2... etc. when the second thing becomes the final value in the array, stop.
	for (int q=0; q<arr.length; q++) {
		for (int i=0; i<=arr.length-2; i++) {
			if (arr[i]>arr[i+1]){
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}//end for
	}//end for
	System.out.print("your sorted array is as follows: [");
	for (int i=0; i<=arr.length-1; i++){
		if (Math.floor(arr[i])==arr[i]){
			System.out.print((int)(arr[i]));
		}
		else{
			System.out.print(arr[i]);
		}
		if (i!=arr.length-1) {
			System.out.print(", ");
		}
	}
	System.out.print("]");
	}//end main

}//end class