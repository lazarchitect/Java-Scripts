import java.util.Scanner;
public class picker{
	public static void main(String [] args){
	//				  0         1         2        3          4          5        6
	String [] a = {"Eddie", "Justin", "Renish", "Randal", "Cynthia", "Thomas", "Shady"};//us
	int i=0;
	int x;
	Scanner in = new Scanner(System.in);
	while(i<=7){
		System.out.print("<Enter> to get a random name");

		in.nextLine();

		x = (int)(Math.random()*7);

		System.out.println("\n"+a[x] + "\n");
		i++;
	}
	}
}