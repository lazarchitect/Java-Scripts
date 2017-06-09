import java.util.Scanner;
public class StringPrac{
	public static void main(String [] args){
		System.out.println("Input a sentence. I'll fix the grammar.");
		Scanner one = new Scanner (System.in);
		String s = one.nextLine();
		System.out.println("Your new and improved sentence is \""+grammerFixer(s)+"\"");

	}
	public static String grammerFixer(String s){



		while(s.charAt(0)==' '){//make sure there are no spaces at the beginning
			s = s.substring(1);
		}

			while (s.charAt(s.length()-1)==' '){//make sure there are no spaces at the end
			s = s.substring(0,s.length()-2);
		}

		while(s.charAt(s.length()-1)!='!' && s.charAt(s.length()-1)!='?' && s.charAt(s.length()-1)!='.'){//making sure the sentence ends right
			s += ".";
		}

		if (Character.isLowerCase(s.charAt(0))){//if the very first letter is lowercase, fix that shit.
			s=Character.toUpperCase(s.charAt(0))+s.substring(1);
		}

		for (int i=0; i<s.length(); i++){//iterate through

			if (s.charAt(i)==' ' && s.charAt(i+1)==' '){//make sure theres no double spaces
				s = s.substring(0,i)+s.substring(i+1);
				i-=1;
			}

			if (s.charAt(i)=='i' && s.charAt(i+1)==' ' && s.charAt(i-1)==' '){//i by itself should be capitalized. DOESNT WORK WHEN ITS AT THE VERY END OF A SENTENCE
				s = s.substring(0,i)+"I"+s.substring(i+1);
				i--;
			}

			if (i!=0 && s.charAt(i)==Character.toUpperCase(s.charAt(i))){//random capitalized letters should be lowercase'd.
				char q = Character.toLowerCase(s.charAt(i));
				s = s.substring(0,i)+q+s.substring(i+1);
			}
		}//end for
		return s;
	}
}