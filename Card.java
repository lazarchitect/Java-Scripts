import java.util.ArrayList;
public class Card{
	
	private char value;
	private String suit;
	
	static char [] values = {'A', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'J', 'Q', 'K'};
	static String [] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
	
	public Card(){//new random card
		this.value = values[(int)(Math.random()*values.length)];
		this.suit = suits[(int)(Math.random()*suits.length)];
	}
	
	public Card(char value, String suit){//draw this specific card
		this.value = value;
		this.suit = suit;
	}
	
	public char getValue(){
		return value;
	}
	
	public String getSuit(){
		return suit;
	}

	public String toString(){
		String s = "";
		if(getValue()=='A'){
			s+="Ace";
		}
		else if(getValue()=='J'){
			s+="Jack";
		}
		else if(getValue()=='Q'){
			s+="Queen";
		}
		else if(getValue()=='K'){
			s+="King";
		}
		else if(getValue()=='0'){
			s+="10";
		}
		else{
			s+=getValue();
		}
		return s + " of " + suit;
	}
	
	public static void printHand(ArrayList<Card> hand){
		System.out.println("Your hand consists of:");
		for (int i=0; i<hand.size(); i++) {
			System.out.println(hand.get(i));
		}
	}
	
	public static void draw(ArrayList<Card> hand, int thisMany){
		for (int i=0; i<thisMany; i++) {
			hand.add(new Card());
		}
	}
	public static void draw(ArrayList<Card> hand){//overloaded without number. just does 1. could also call the other one with (hand, 1)
			hand.add(new Card());
	}
	public void pickup(ArrayList<Card> hand){
		hand.add(this);
	}
	public static void shuffle(ArrayList<Card> deck){
		for(int i=0; i<deck.size(); i++){
			//swap with another random Card
			int x = (int)(Math.random()*deck.size());
			Card temp = new Card();
			temp.value = deck.get(i).value;
			temp.suit = deck.get(i).suit;
			
			deck.get(i).value = deck.get(x).value;
			deck.get(i).suit = deck.get(x).suit;
			
			deck.get(x).value = temp.value;
			deck.get(x).suit = temp.suit;
			
			
			
			
			
			
			
		}
	}
}