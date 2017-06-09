import java.util.Scanner;
public class first{
	public static void main(String [] args){
	System.out.println("Input your own three integers, and I'll return the largest and tell you if there was a tie.");
	Scanner one = new Scanner (System.in);
	int a = one.nextInt(), b = one.nextInt(), c = one.nextInt();
	System.out.println("return: "+second.greatest(a,b,c));
	}
}