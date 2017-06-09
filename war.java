import java.util.*;
public class war{
	public static void main(String [] args)throws InterruptedException{
		
		ArrayList<Card> deck = new ArrayList<Card>();
		for (int i=0; i<Card.values.length; i++) {
			for (int j=0; j<Card.suits.length; j++) {
				deck.add(new Card(Card.values[i], Card.suits[j]));
			}
		}
		/*
		System.out.println("Here's the deck unshuffled: "+deck);
		System.out.println("And here it is shuffled.");
		Card.shuffle(deck);
		System.out.println(deck);
		System.out.println("Very cool.");
		Thread.sleep(10000);
		*/
		
		
		
		ArrayList<Card> p1Hand = new ArrayList<Card>();
		ArrayList<Card> p2Hand = new ArrayList<Card>();
		for (int i=0; i<26; i++){
			Card a = deck.get((int)(Math.random()*deck.size()));
			p1Hand.add(a);
			deck.remove(a);
		}
		for (int i=0; i<26; i++){
			Card a = deck.get((int)(Math.random()*deck.size()));
			p2Hand.add(a);
			deck.remove(a);
		}
		//System.out.println(p1Hand);
		//System.out.println(p2Hand);
		while(p1Hand.size()!=0 && p2Hand.size()!=0){
			//System.out.println("Player 1's Hand: "+p1Hand);
			//System.out.println("Player 2's Hand: "+p2Hand);
			String s = battle(p1Hand, p2Hand, 0);		
			if(s.equals("g")){
				return;
			}
			else if(s.charAt(0)=='>'){
				for (int i=0; i<(int)(s.charAt(1))-48; i++){
					p1Hand.add(p2Hand.get(0));
					p2Hand.remove(0);
					p1Hand.add(p1Hand.get(0));
					p1Hand.remove(0);
				}
				
			}
			else if(s.charAt(0)=='<'){
				for (int i=0; i<(int)(s.charAt(1))-48; i++) {
					p2Hand.add(p1Hand.get(0));
					p1Hand.remove(0);
					p2Hand.add(p2Hand.get(0));
					p2Hand.remove(0);
				}
			}			
		
		
		}	
	}
	
	public static String battle(ArrayList<Card> p1Hand, ArrayList<Card> p2Hand, int x){
		if(p1Hand.size()<=x){
			System.out.println("Player 2 Wins!");
			return "g";
		}
		if(p2Hand.size()<=x){
			System.out.println("Player 1 wins!");
			return "g";
		}
		System.out.println("Player 1's card:");
		Card p1 = p1Hand.get(x);
		System.out.println(p1);
			
		System.out.println("Player 2's card:");
		Card p2 = p2Hand.get(x);
		System.out.println(p2+"\n\n\n");
		
		if(numberValue(p1)>numberValue(p2)){
			System.out.println("Player 1 wins!");
			return ">"+(x+1);
		}
		else if(numberValue(p1)<numberValue(p2)){
			System.out.println("Player 2 wins!");
			return "<"+(x+1);		
		}
		else{
			System.out.println("It's a tie!");
			return battle(p1Hand, p2Hand, x+4);
		}
	}
	
	
	public static int numberValue(Card a){
		if(a.getValue()=='J'){
			return 11;
		}
		if(a.getValue()=='Q'){
			return 12;
		}
		if(a.getValue()=='K'){
			return 13;
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
}