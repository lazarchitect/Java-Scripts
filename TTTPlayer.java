public class TTTPlayer{
	public static void main(String[] args) {

		int x, y; 
		boolean player1JustWent = false; 
		char c; 
		int moveCount = 0;

		if(args.length > 2){// if it has any command line argument at all besides the class name, its an AI game.
			System.out.println("AI Game");
		}
		
		else{
			//2-person game.
			printBoard();
			while(!(someoneWon())){
				System.out.println("X goes. enter the x-coordinate, press enter, then enter the y-coordinate.");	
				player1JustWent=true;
				c = 'X';
				go(c); moveCount++;
				printBoard();
				if(someoneWon() || moveCount>=9){break;}
				System.out.println("O goes. enter the x-coordinate, press enter, then enter the y-coordinate.");
				c = 'O';
				player1JustWent=false;
				go(c); moveCount++;
				printBoard();
			}
		}

		if(someoneWon()){
			if(player1JustWent){
				System.out.println("Player 1 wins!");
				return;
			}
			System.out.println("Player 2 wins!");
		}
		else{
			System.out.println("tie!");
		}
	}
}