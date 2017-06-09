//import java.util.*;
public class monty{
	public static void main(String[] args){

		String a="",b="",c="",remain = "";
		int changewin=0, staywin = 0, changeloss=0, stayloss=0;
		for (int i=0; i<=1000000; i++) {

			if (i%10000==0) {
				System.out.println(i);
			}



			int z = (int)(Math.random()*100);

			if (z%3==0){
				a = "car";
			}
			else{
				a="goat";
			}
			if (((z+1)%3)==0){
				b = "car";
			}
			else{
				b="goat";
			}
			if (((z+2)%3)==0){
				c = "car";
			}
			else{
				c="goat";
			}

			////System.out.println(a + b + c);
			//System.out.println("Pick a door, Door <A>, Door <B>, or Door <C>. \nOne will have a car behind it. the other two have goats behind them. \nAnything you find is yours to keep.");
			//Scanner one = new Scanner (System.in);
			String s = "";
			z = (int)(Math.random()*100);
			if (z%3==0){
				s = a;
			}
			if (((z+1)%3)==0){
				s = b;
			}
			if (((z+2)%3)==0){
				s = c;
			}//where you pick the door randomly
			/*while (!(s.equalsIgnoreCase("A") || s.equalsIgnoreCase("B") || s.equalsIgnoreCase("C"))) {
				System.out.println("try again.");
				s = one.nextLine();
			}*/
			//System.out.print("Okay, now we're going to reveal one of the doors you didnt choose. Here is door ");

			//whatever door he picked, check the other two and Print the one thats a goat.

			if (s.equalsIgnoreCase("A")) {
				if (b.equals("goat")){
					//System.out.println("B: "+b);
					remain = c;
				}
				else{
					//System.out.println("C: "+c);
					remain = b;
				}
			}
			else if (s.equalsIgnoreCase("B")) {
				if (a.equals("goat")){
					//System.out.println("A: "+a);
					remain = c;
				}
				else{
					//System.out.println("C: "+c);
					remain = a;
				}
			}
			else{
				if (a.equals("goat")){
					//System.out.println("A: "+a);
					remain = b;
				}
				else{
					//System.out.println("B: "+b);
					remain = a;
				}
			}
			//System.out.println("Do you want to change your mind, and instead select the remaining door? yes or no, no punctuation.");

			if (z%2==0) {
				s = "yes";
			}
			else{
				s = "no";
			}
			/*while(!(s.equalsIgnoreCase("yes") || s.equalsIgnoreCase("no"))){
				//System.out.println("Not an option. try again.");
				s = one.nextLine();
			}*/
			if (s.equalsIgnoreCase("yes")) {
				//System.out.println(remain);
				if (remain=="car") {
					//System.out.println("you won!");
					changewin++;
				}
				else{
					changeloss++;
					//System.out.println("you lost.");
				}
			}
			else if (s.equalsIgnoreCase("no")) {
				//System.out.println(remain);
				if (remain=="goat") {
					//System.out.println("you won!");
					staywin++;
				}
				else{
					//System.out.println("you lost.");
					stayloss++;
				}
			}
		}//end for



		System.out.println("\n\nAmount of times changed and won was "+changewin+". Amount of times didnt and won was "+staywin+". Amount of times changed and lost was "+changeloss+". Amount of times stayed and lost was "+stayloss+".");
		//System.out.println("Door A was a "+a+". Door B was a "+b+". Door C was a "+c+".");
	}
}