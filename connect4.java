import java.util.*;
public class connect4{
	
	/*TODO:
	diagonal wincons
	wincons need only check column or row of the most recent move
	wincons can stop if the counter is 1 past a certain point
	//verticals can break when they encounter an empty space
	*/
	
	
	
	static char [][] board = new char [6][7];

	public static int takeInput(){//returns which column the player wants to go in. Also checks for error.
		System.out.println("Which column do you want to go in?");
		printBoard();
		System.out.print(">>> ");
		Scanner one = new Scanner (System.in);//declarations
		int choice = 1;
		
		String stringChoice = one.nextLine();//easily type quit at any time to exit the program
		if(stringChoice.equals("quit") || stringChoice.equals("exit")){
			System.exit(1);
		}
		
		System.out.println("\n\n");
		
		
		try{
			choice = Integer.parseInt(stringChoice);//checks if the input is a valid integer.
		}
		catch (NumberFormatException e){
			System.out.println("Gotta be a valid number, chief.");
			return takeInput();
		}
		
		choice-=1;//since the indices are 0-6 but I let the player choose 1-7
		
		if (choice<0){//checks if choice is within the board
			System.out.println("Too low!");
			return takeInput();
		}
		if (choice>6){//checks if choice is within the board
			System.out.println("Too high!");
			return takeInput();
		}
		if (!spotIsEmpty(0, choice)){//checks if that column is full
			System.out.println("That column is full.");
			return takeInput();
		}
		return choice;
	}
	
	public static boolean spotIsEmpty(int y, int x){
		return (board[y][x]!='x' && board[y][x]!='o');//if that spot has no piece in it
	}
	
	public static boolean boardIsFull(){//pretty simple. checks the top row to see if all the columns are full
		for (int x=0; x<board[0].length; x++) {
			if(spotIsEmpty(0,x)){//if any column is not full...
				return false;
			}
		}
		return true;
	}
	
	public static boolean someoneWon(){//checks if someone has won
		int counter = 1;
		//check for any horizontal wins.
		/*for (int a = 0; a<board.length; a++){
			for (int b = 0; b<board[a].length-1; b++){
				if(board[a][b] == board[a][b+1] && !spotIsEmpty(a, b+1)){
					counter++;
					if(counter==4){
						return true;
					}
				}
				else{
					counter = 1;
				}
			}
		}
		counter=1;
		//check for any vertical wins.
		for (int d=0; d<7; d++){
			for (int c=5; c>0; c--){
				if(spotIsEmpty(c,d)){
				break;
				}
				if(board[c][d] == board[c-1][d] && !spotIsEmpty(c,d)){
					counter++;
					if(counter==4){
						return true;
					}
				}
				else{
					counter = 1;
				}
			}
		}
		counter=1;*/
		//check for any diagonal wins.
		//perhaps make different methods for right-leaning and left leaning lines?	
		int e; int f; int count=0;
		while (count<4){//right-leaning wins
			if(board[5-count][count] == board[4-count][count+1] && !spotIsEmpty(board[4-count][count+1])){
				counter+=1;
				if(counter==4){
					return true;
				}
			}
			else{
				counter = 1;
			}
			e++;f++;
		}
		/*for (e = 7; e<4; e++) {
			for (f = 0; f<3; f++) {
				//we want to check board[f][e], board[f+1][e+1], etc
				if(board[e][f] == board[e+1][f+1] && !spotIsEmpty(e+1,f+1)){
					counter++;
					if(counter==4){
						return true;
					}
				}
				else{
					counter = 1;
				}
			}
		}*/
		
		
		return false;//if there are no wins anywhere....
	}
	
	public static void printBoard(){//nicely formatted board.
		for (int i=0; i<board.length; i++){
			for (int j=0; j<board[i].length; j++){
				System.out.print("| "+board[i][j]+" ");
			}
			System.out.println("|");
			System.out.println("_____________________________");//29 underscores
		}
		System.out.println("  1   2   3   4   5   6   7");
	}
	
	public static void move(int choice, int player){//given whose turn it is and where they want to go, fills the spot with their piece
		
		int max=5;
		for(int i=5; i>0; i--){
			if (!spotIsEmpty(i, choice)){
				max-=1;
			}
			else{
				break;
			}
		}
		
		if(player==1){
			board[max][choice] = 'x';	
		}
		else if(player == 2){
			board[max][choice] = 'o';
		}
		
	}
	
	public static void main(String [] args){
		int choice;
		int player = 1;//whose turn currently is it? Player 1 starts.
		System.out.println("\n\nWelcome to Connect 4! Right now, only horizontal wins work.");//Enter Q for the rules, or anything else to get started!
		while(true){
			System.out.println("Player "+player+", it's your turn.");
			choice = takeInput();//where do they want to go?
			move(choice, player);//make the move.
			if(someoneWon()){
				printBoard();
				System.out.println("Congrats, player "+player+"! You win!");
				return;
			}
			if(boardIsFull()){
				printBoard();
				System.out.println("It's a tie!");
				return;
			}
			if(player==1){
				player=2;
			}
			else{
				player=1;
			}
		}
		
		
		
	}
}