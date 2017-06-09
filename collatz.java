import java.util.Scanner;
public class collatz{
	public static void main(String [] args) throws InterruptedException{
		
		System.out.println("the famous Collatz Conjecture. If a number is even, it divides by 2. If it's odd, it multiples by 3 and adds 1. Enter any integer and it will eventually turn into 1(or -1 if you input a negative). Enter 0 or anything else to quit.");
		while(true){
			int x;
			Scanner one = new Scanner (System.in);
			try{
				x=one.nextInt();
			}
			catch(Exception e){
				return;
			}
			int count = 0;
				if(x == 0){
					break;
				}
				while (x!=1 && x!=-1){
					if (x%2==0){
						x/=2;
					}
					else {
						x=(x*3)+1;
					}
					count++;
					if (x==1 || x==-1) {
						System.out.print(x+"!");
						break;
					}
					System.out.print(x+".");
					Thread.sleep(20);
					System.out.print (".");
					Thread.sleep(20);
					System.out.print (". ");
					Thread.sleep(100);
				}



			if (count==1){
			System.out.println("\nyour input took "+count+" iteration. ...nice.");
			}
			else {
				System.out.println("\nyour input took "+count+" iterations. ...nice.");
			}
		}
	}
}