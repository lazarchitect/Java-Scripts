import java.util.Scanner;
class reverseWord{
	static String reverser(String s){
		if (s.length()<=1){return s;}
		return reverser(s.substring(1))+s.charAt(0);
	}
	static boolean allTheSame(String s){
		if(s.length()<=1){return true;}
		if(s.charAt(0)==s.charAt(1)){
			return allTheSame(s.substring(1));
		}
		return false;
		
		
	}
	static boolean isPalindrome(String s){
		if(s.length()<=1){return true;}
		if (s.charAt(0)==s.charAt(s.length()-1)){
			return isPalindrome(s.substring(1, s.length()-2));
		}
		return false;
	}
	
	static void main(String [] args){
		System.out.println("Enter a string to be reversed.");
		Scanner one  = new Scanner(System.in);
		String s = one.nextLine();
		if (s.length()==0){
			System.out.println("you didnt input anything! The empty string doesnt count.");
			return;
		}
		else if (s.length()==1) {
			System.out.println("Nothing's gonna happen on a string that's 1 character long!");
			return;
		}
		else if(isPalindrome(s)){
			System.out.println("Nothing's gonna happen on a palindromic string!");
			return;
		}
		if (allTheSame(s)){
			System.out.println("nothings gonna happen to your string if its all the same characters!");
			return;
		}
		System.out.print("Your output string: \""+reverser(s)+"\"");
	}
}