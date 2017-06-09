import java.util.Scanner;

public class madlibs{
	
	public static String ifN(String gnirts){
		if (gnirts.charAt(0)=='a' || gnirts.charAt(0)=='e' || gnirts.charAt(0)=='i' || gnirts.charAt(0)=='o' || gnirts.charAt(0)=='u' || gnirts.charAt(0)=='A' || gnirts.charAt(0)=='E' || gnirts.charAt(0)=='I' || gnirts.charAt(0)=='O' || gnirts.charAt(0)=='U') {
		return "n";
	}
	else{
		return "";
	}
	}//endifN

	public static void main(String [] args){

	Scanner zeroth = new Scanner(System.in);
	Scanner first = new Scanner(System.in);
	Scanner second = new Scanner(System.in);
	Scanner third = new Scanner(System.in);
	Scanner fourth = new Scanner(System.in);
	Scanner fifth = new Scanner(System.in);
	Scanner sixth = new Scanner(System.in);
	Scanner seventh = new Scanner(System.in);
	Scanner eighth = new Scanner(System.in);
	Scanner ninth = new Scanner(System.in);
	Scanner tenth = new Scanner(System.in);
	Scanner eleventh = new Scanner(System.in);
	Scanner twelfth = new Scanner(System.in);
	Scanner thirteenth = new Scanner(System.in);
	Scanner fourteenth = new Scanner(System.in);
	Scanner fifteenth = new Scanner(System.in);
	Scanner sixteenth = new Scanner(System.in);
	Scanner seventeenth = new Scanner(System.in);
	Scanner eighteenth = new Scanner(System.in);
	Scanner nineteenth = new Scanner(System.in);
	Scanner twentieth = new Scanner(System.in);

	System.out.println("Time for Mad Libs! Whose story do you want? enter 'accountant', 'college student', or 'patient'.");
	String z = zeroth.nextLine();
	/////////////////////////////////////////////////////////
	if (z.equals("accountant")){
		System.out.println("Give me a female name.");
		String a = first.nextLine();
		System.out.println("Give me an adjective.");
		String b = second.nextLine();
		System.out.println("Give me a noun.");
		String c = third.nextLine();
		System.out.println("Give me a name.");
		String d = fourth.nextLine();
		System.out.println("Give me a name.");
		String e = fifth.nextLine();
		System.out.println("Give me a verb.");
		String f = sixth.nextLine();
		System.out.println("Give me a plural noun.");
		String g = seventh.nextLine();
		System.out.println("Give me a common place.");
		String h = eighth.nextLine();
		System.out.println("Give me a noun.");
		String i = ninth.nextLine();
		System.out.println("Give me an adjective.");
		String j = tenth.nextLine();
		System.out.println("Give me a noun.");
		String k= eleventh.nextLine();
		System.out.println("Give me an exclamation.");
		String l = twelfth.nextLine();
		System.out.println("Give me an adjective.");
		String m= thirteenth.nextLine();
		System.out.println("Give me a number.");
		String n = fourteenth.nextLine();
		System.out.println("Give me a number.");
		String o = fifteenth.nextLine();
		System.out.println("Give me a number.");
		String p = sixteenth.nextLine();
		System.out.println("Give me a verb.");
		String q = seventeenth.nextLine();
		System.out.println("Give me an adjective.");
		String r = eighteenth.nextLine();
		System.out.println("Give me an adverb.");
		String s = nineteenth.nextLine();
		System.out.println("give me a past-tense verb.");
		String t = twentieth.nextLine();
		System.out.println("Story Time!");

		System.out.print(a +" was a"+ifN(b)+" "+b+" accountant with a complexion like that of a" +ifN(c)+ " " +c+ ". ");

		System.out.print("On the first day of work at her new firm, "+d+" and " +e+ " Brothers, she couldnt help but " +f+ " right into some "+g+". She ran into a nearby "+h+" and tried to clean them off with a"+ifN(i)+" " +i+", but to no avail. There was no choice but to present herself, generally a woman of " +j+ " standing, to her new boss looking like a " +k+ "... \"" +l+ "\", " +a+ " thought to herself. At least she gets a"+ifN(m)+ " "+m+" new office to be alone in. When she got to her room, number " +n+ ", she realized it was only " +o+ " by " +p+ " feet. This was not to her standard of workplace profession at all. She began to " +q+ " loudly, catching some " +r+ " glances from her co-workers. Just then, a tornado blew through the building and " +a+ " " +s+ " "+t+" out a window.");

	}//end lawyer
    if (z.equals("college student")){
		System.out.println("Give me a verb ending in -ING.");
		String a = first.nextLine();
		System.out.println("Give me a body part.");
		String b = second.nextLine();
		System.out.println("Give me a male name.");
		String c = third.nextLine();
		System.out.println("Give me a field of study.");
		String d = fourth.nextLine();
		System.out.println("Give me any name.");
		String e = fifth.nextLine();
		System.out.println("Give me a drug.");
		String f = sixth.nextLine();
		System.out.println("Give me a body part.");
		String g = seventh.nextLine();
		System.out.println("Give me an article of clothing.");
		String h = eighth.nextLine();
		System.out.println("Give me another article of clothing.");
		String i = ninth.nextLine();
		System.out.println("Give me a common place.");
		String j = tenth.nextLine();
		System.out.println("Give me a past-tense verb.");
		String k= eleventh.nextLine();
		System.out.println("Give me an adjective.");
		String l = twelfth.nextLine();
		System.out.println("Give me an adjective.");
		String m= thirteenth.nextLine();
		System.out.println("Give me an animal.");
		String n = fourteenth.nextLine();
		System.out.println("Give me a verb.");
		String o = fifteenth.nextLine();
		System.out.println("Give me a verb.");
		String p = sixteenth.nextLine();
		System.out.println("Give me an adverb.");
		String q = seventeenth.nextLine();
		System.out.println("Give me an past-tense verb.");
		String r = eighteenth.nextLine();
		System.out.println("Give me a food(singular).");
		String s = nineteenth.nextLine();
		System.out.println("give me a past-tense verb.");
		String t = twentieth.nextLine();
		System.out.println("Story Time!");

		System.out.print("Due to the constant " +a+" of his "+b+", "+c+" could not just sit and pay attention to his "+d+" lecture. His friend "+e+" then offered him "+f+" to help him cope with his " +a+"ing "+b+". He started tripping "+g+" in the middle of the lecture. He ran out the door after removing his "+h+" and "+i+". He ran all the way to nearest "+j+" and "+k+" all over the  place. Some "+l+" looking girl walked up to him and asked if he needed any help. "+c+" took a"+ifN(m)+ " "+ m+" "+n+" out of his pocket and threw it at her. She started to "+o+" and "+p+" and left as "+q+" as possible. He found a vending machine and "+r+" it and some "+s+" "+ t+" out. He ate it and then the "+n+" came back and stole his "+s+". "+c+" then ate the "+n+" and came down from his "+f+" high. THE END");

    }//end college student
    if (z.equals("patient")) {
		System.out.println("Give me a title, like Mr. or Dr.");
		String a = first.nextLine();
		System.out.println("Give me a last name.");
		String b = second.nextLine();
		System.out.println("Give me an adjective.");
		String c = third.nextLine();
		System.out.println("Give me a body part.");
		String d = fourth.nextLine();
		System.out.println("Give me an adverb.");
		String f = sixth.nextLine();
		System.out.println("Give me another adjective.");
		String g = seventh.nextLine();
		System.out.println("Give me a food.");
		String h = eighth.nextLine();
		System.out.println("Give me a store.");
		String i = ninth.nextLine();
		System.out.println("Give me a past tense verb.");
		String j = tenth.nextLine();
		System.out.println("Give me a food.");
		String k= eleventh.nextLine();
		System.out.println("Give me a number.");
		String l = twelfth.nextLine();
		System.out.println("Give me another number.");
		String m= thirteenth.nextLine();
		System.out.println("Give me a verb.");
		String n = fourteenth.nextLine();
		System.out.println("Give me a celebrity's name.");
		String o = fifteenth.nextLine();
		System.out.println("Give me a verb.");
		String p = sixteenth.nextLine();
		System.out.println("Give me an amount of time, like minute or decade.");
		String q = seventeenth.nextLine();
		System.out.println("Give me a noun.");
		String r = eighteenth.nextLine();
		System.out.println("Give me a verb ending in -ING.");
		String s = nineteenth.nextLine();
		System.out.println("Story Time!");
 		
 		System.out.print(a +" "+ b+ " got a"+ifN(c)+" " +c+ " rash on his "+d+" last night. At first he wasnt sure how it was able to grow so "+f+", but then he remembered the "+g+" "+h+" he had eaten from "+i+". He "+j+" on the internet that eating "+k+" "+l+" times a day for "+m+" days would help, but he wasnt sure, so he went to "+n+" his doctor. She told "+a+" "+b+" that she treated "+o+" for the same thing. All he had to do was "+p+" for a"+ifN(q)+" "+q+" while holding a "+r+" and "+s+"ing up and down.");
    }//end patient
    
	else{
    	System.out.println("Not a choice. Perhaps you spelled it wrong? Try again.");
    }
	}
}