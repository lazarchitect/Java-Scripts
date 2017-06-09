import java.util.Scanner;
public class binary{
	public static void main(String[] args) {
		// System.out.println("enter a number between 1 and 100.");
		int [] a = {2,5,7,9,20,38,47,51,56,78,109};
		System.out.println("heres the array. which num should I find?");
		for (int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		Scanner one = new Scanner (System.in);
		int x = one.nextInt();
		System.out.println("The number is at index "+binarySearch(a, x, 0, a.length-1));
	}
	public static int binarySearch(int [] a, int x, int low, int high){
		//check if the center item(rounded down) is equal to x. if so, return it. if not, check if it's greater. 
		//repeat with second half or first half of array, depending.
		if (a[high/2]==x){
			return x;
		}
		if (a[a.length/2]>x) {
			return binarySearch(a, x, low, high/2);
		}
		else{
			return binarySearch(a, x, high/2, high);
		}
	}
}