import java.util.*;
public class timeter{
	public static void main(String [] args)throws InterruptedException{//file creation

	Scanner one = new Scanner(System.in);//scanner input object creation
	System.out.println("this program will alert you when an input interval of seconds x passes, up to y intervals. then it will stop. for example, put 60 for the first one to measure minutes, and putting 3 for the second one will measure 3 minutes.");
	System.out.println("how long should each interval be?");	//mission statement and variable creation
	long x = one.nextLong();
	System.out.println("how many intervals?");
	double y=one.nextDouble();
			
	for(int a=1; a<=y; a++){//loop. this is where the magic happens.
		Thread.sleep(x*1000);
		if (x==1){System.out.print(a+"... ");}
		else if (a==1){System.out.println(a + " interval has passed.");}
		else {System.out.println(a + " intervals have passed.");}
	}
	System.out.println("DING! Done.");
	}
}