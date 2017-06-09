public class drag{
	public static void main (String [] args){
	String drWord;
	System.out.println("Input a string containing 'dr' somewhere with at least 2 letters after that. I'll output the dr and the other 2.");
	String word=IO.readString();
	drWord=word.substring(word.indexOf("dr"),word.indexOf("dr")+4);
	System.out.print(drWord);
	}
}




