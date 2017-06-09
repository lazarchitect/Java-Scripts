import java.util.Scanner;

public class enters{
	public static void main (String [] args){

		System.out.println("This program will count how many times you press enter. <q> to stop the program.");

		Scanner one = new Scanner(System.in);		//create scanner object

		String quit = one.nextLine();				//assign input to String quit

		int i=1;									//counter variable

		while(!quit.equals("q")){							//loop. checks if input is the canceling value.

			i++;									//adds 1 to the counter of how many times enter was pressed.

			quit = one.nextLine();					//asks for new input. this is how the loop can be canceled.

		}
		System.out.println("the number of times you pressed enter was "+ i+".");
	}
}