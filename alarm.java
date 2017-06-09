import java.util.Scanner;
public class alarm{
	public static void main(String [] args)throws InterruptedException{

	System.out.println("this program will alert you when a preset amount of time has passed.");

	Scanner one = new Scanner (System.in);
	Scanner two = new Scanner (System.in);
	int x=1;

	String a = "dsgddfgsd";
	while (!(a.equals(""))){
		System.out.println("How long should the alarm be, in seconds?");
		x = one.nextInt();
		System.out.println("Press enter to start the alarm, or spacebar then enter to reset the alarm.");
		a = two.nextLine();
	}
	System.out.print("Starting now.");
	Thread.sleep(1000*x);
	System.out.print("\nDone!");

	}
}