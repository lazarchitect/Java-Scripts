import java.util.*;

public class TTT{//tictactoe board. 
	static Scanner one = new Scanner (System.in);
	
	public static char [][] board = new char[3][3]; 
	
	public static void printBoard(){
		System.out.println("\n");
		for (int vert=2;vert>=0; vert--) {

			System.out.print((vert+1)+"  ");

			for (int hor=0;hor<=2; hor++) {

				System.out.print(board[vert][hor]);

				if (hor!=2) {

					System.out.print("|");

				}

			}

			System.out.println();

			if(vert!=0){System.out.println("   _____");}

			

		}
		System.out.println("   1 2 3");
	}

	public static boolean someoneWon(){

		if (
			(board[0][0] == board[0][1] && board[0][0] == board[0][2] && board[0][0]!='\u0000') ||//horizontals. good.
			(board[1][0] == board[1][1] && board[1][0] == board[1][2] && board[1][0]!='\u0000') ||
			(board[2][0] == board[2][1] && board[2][0] == board[2][2] && board[2][0]!='\u0000') ||
			
			(board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[0][0]!='\u0000') ||//verticals.
			(board[0][1] == board[1][1] && board[0][1] == board[2][1] && board[0][1]!='\u0000') ||
			(board[0][2] == board[1][2] && board[0][2] == board[2][2] && board[0][2]!='\u0000') ||

			(board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0]!='\u0000') ||//diagonals. good.
			(board[2][0] == board[1][1] && board[2][0] == board[0][2] && board[2][0]!='\u0000')
			) {
			return true;
		}
		return false;
	}
	
	public static void go(char c){//for a single player to make a single move. c is the player's letter.
			int x = 0; int y=0;
			try{
				one = new Scanner (System.in);
				x = one.nextInt();
				y = one.nextInt();
				
				while (x>3 || x<1 || y>3 || y<1 || board[y-1][x-1]!='\u0000') {

					System.out.println("cant go there. try again.");

					printBoard();
					one = new Scanner (System.in);
					x = one.nextInt();

					y = one.nextInt();

				}
			}
			catch(InputMismatchException e){
				System.out.println("thats not an integer between 1 and 3, silly! Try again. ");//By the way, if you mess up a second time, the program will crash.
				go(c);//make this iterative instead of recursive its causing errors
			}
			
			
			board[y-1][x-1] = c;
	}
	
	
	public static void cpu(char c){
		//if I have any two set, go there.
		//else if the enemy has any two set, block them.
		//else if i have any one set, try to fill it.
		//else if the middle is empty, go there.
		//else, go randomly.
		if(myTwoSets(c)){
			return;
		}
		char d = c == 'X'?'O':'X';
		if(theirTwoSets(d)){
			return;
		}
		if(myOneSets(c)){//run assuming twoSets failed
			return;
		}
		if(board[1][1] == '\u0000'){
			board[1][1] = c;
			return;
		}
		goRandomly(c);
	}
	
	public static boolean checkSets(int i, int j, char a, char b){
		return false;
	}
	
	public static boolean myTwoSets(char c){
		//if i have a piece on the board with an adjacent piece also mine AND the third spot in the line is empty, go there and return true. else, return false.
		
		for(int i = 0; i < 3; i++){
			for (int j = 0; j<3; j++){
				if(board[i][j] == c){
					if(checkSets(i, j, c, c)){
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public static boolean theirTwoSets(char c){
		//if the enemy has a piece on the board with an adjacent piece also theirs AND the third spot is empty, go there and return true. else, return false.
		char d = c == 'X'?'O':'X';
		for(int i = 0; i < 3; i++){
			for (int j = 0; j<3; j++){
				if(board[i][j] == d){
					if(checkSets(i, j, d, d)){
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public static boolean myOneSets(char c){
		//if i have a piece on the board with any adjacent space empty, fill either of those spaces and return true. else, return false.
		for(int i = 0; i < 3; i++){
			for (int j = 0; j<3; j++){
				if(board[i][j] == d){
					if(checkSets(i, j, d, '\u0000')){
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public static void goRandomly(char c){
		while(true){
			int x = (int)(Math.random()*3);
			int y = (int)(Math.random()*3);
			if(board[x][y] == '\u0000'){
				board[x][y] = c;
				return;
			}
		}
	}
	
	
	
	

	public static void main(String[] args) {

		int x, y; 
		boolean player1JustWent = false; 
		char c='X'; 
		int moveCount = 0;

		if(args.length > 0){// if it has any command line argument at all besides the class name, its an AI game.
			if((int)(Math.random()*2) == 1) player1JustWent = true;
			while(!(someoneWon())){
				if(moveCount>=9) break;
				printBoard();
				if(player1JustWent){
					System.out.println("Computer goes.");
					cpu(c); moveCount++;
					player1JustWent = false;
				}
				else{
					System.out.println("Your turn. Enter the x-coordinate and then enter the y-coordinate.");
					go(c); moveCount++;
					player1JustWent = true;
				}
				c = c == 'X'?'O':'X';
			}
		}
		
		else{
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

		printBoard();
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