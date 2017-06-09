import javax.swing.*;
import java.util.*;
public class blackjack{
	public static void main(String [] args){	
		int [] nums = {1,2,3,4,5,6,7,8,9,10,10,10,10};
		//to implement: 1 CAN ALSO BE COUNTED AS 11.
		//maybe make an arraylist of all cards and remove them as theyre drawn, to create a strategy for card counting? more realistic
		
		/*ArrayList<Card> hand = new ArrayList<Card>();
		
		for (int i=0; i<Card.suits.length; i++) {
			for (int q = 0; q<Card.values.length; q++) {
				hand.add(new Card(Card.values[q], Card.suits[i]));
			}
		}
		
		System.out.println(hand);*/
		Card q = new Card();
		int a = playercharacter(nums, q);
		if (a==-2){//blackjack
			return;
		}
		if(a==-1){
			System.out.println("You lose. You went over.");
			return;
		}
		
		int b = dealer(nums, q);
		if(b==-2){
			return;
		}
		if (b==-1){
			System.out.println("You win! Dealer went over.");
			return;
		}
		if(a>b){
			System.out.println("You win! Dealer had "+b+".");
		}
		else if(b>a){
			System.out.println("Dealer wins! Dealer had "+b+".");
		}
		else{
			System.out.println("It's a tie!");
		}
		
		
			
		
	}
	static int playercharacter(int [] nums, Card q){
		//your hand
		int a = nums[(int)(Math.random()*nums.length)];
		int b = nums[(int)(Math.random()*nums.length)];
		int total = a+b;
		System.out.println("Dealer has "+numberValue(q)+" showing.");
		System.out.println("Your hand consists of " + a + " and "+b+".");
		if((a==10 && b==1) || (b==10 && a==1)){
			System.out.println("Blackjack!");
			return -2;
		}
		while(true){
			String str = JOptionPane.showInputDialog("Hit or stay?");
			if (str.equalsIgnoreCase("stay")){return total;}
			else if(str.equalsIgnoreCase("hit")){
				int c = nums[(int)(Math.random()*nums.length)];
				System.out.println("You drew " + c+".");
				total += c;
				System.out.println("You're now at "+total+".");
				if (total>21){return -1;}
				if (total==21){
					System.out.println("you have 21!");
					return 21;
				}
			}	
			else{System.out.println("What? type \"hit\" or \"stay\", with no punctuation.");}
		}	
	}		
	static int dealer(int [] nums, Card q){
		int a = (int)(q.getValue())-48;
		System.out.println(a);
		int b = nums[(int)(Math.random()*nums.length)];
		int total = a+b;
		//System.out.println("Dealer has "+a+" showing.");
		String str;
		if((a==10 && b==1) || (b==10 && a==1)){
			System.out.println("Dealer has Blackjack!");
			return -2;
		}
		while(true){
			if (total<12){str = "hit";}
			else if(total>16){str = "stay";}
			else{
				if((int)(Math.random()*10)%2==0){
					str = "hit";
				}
				else{
					str = "stay";
				}
			}
			if (str.equals("stay")){return total;}
			else if (str.equals("hit")){
				int c = nums[(int)(Math.random()*nums.length)];
				System.out.println("Dealer drew "+c+".");  
				total += c;
				if (total>21){return -1;}
				if (total==21){
					return 21;
				}
			}
		}//end while
	}//end dealer
	public static int numberValue(Card a){
		if(a.getValue()=='J'){
			return 10;
		}
		if(a.getValue()=='Q'){
			return 10;
		}
		if(a.getValue()=='K'){
			return 10;
		}
		if(a.getValue()=='A'){
			return 1;
		}
		if(a.getValue()=='0'){
			return 10;
		}
		int b = (int)(a.getValue()-48); 
		return b;
	}	
}//end class