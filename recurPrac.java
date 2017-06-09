import java.util.Scanner;
public class recurPrac{
	
	static public int digiter(int n){
		if (n<0){
			n*=-1;
		}
		if(n/10<=0){
			return 1;
		}
		return 1+digiter(n/10);
	}

	public static void main(String [] args){
		System.out.println("this program finds the number of digits of an input integer.\nInput an integer: ");
		Scanner one = new Scanner (System.in);
		int n = one.nextInt();
		System.out.println("The number of digits is " + digiter(n)+".");


	}
}