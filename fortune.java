import java.util.Scanner;
public class fortune{
	public static void main(String[] args) {
		Scanner one = new Scanner (System.in);
		String [] first = {"You will ","You might ", "You will consider trying to ","You will try your hardest to ","Something will ","A close friend will ","Your worst enemy will ","It only takes a second to ","Remember to ","Do your best to "};
		String [] second = {"get a big sloppy kiss ", "die horribly ", "fall over ", "fall in love ","receive an injury ","gain superpowers ","care for others ","hunt and cook a goose ","forget to put on deoderant ","lose a huge amount of money ","make a bad business deal ","run into some money "};
		String [] third = {"next year.","when you make your next impulse buy. ","on Tuesday. ","when you least expect it. ","on a plane. ","right now. ","in a few minutes.","a few hours from now. ","in a basement several miles from here."};
		
		int x;
		String cmd;
		while (true){
			System.out.println("Press enter to read your fortune...");
			cmd = one.nextLine();
			if(cmd.equals("quit")){
				break;
			}
			x = (int)(Math.random() * 10);
			System.out.print(first[x]);
			x = (int)(Math.random() * 12);
			System.out.print(second[x]);
			x = (int)(Math.random() * 9);
			System.out.println(third[x]);		
		}		
	}
}