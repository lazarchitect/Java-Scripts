public class xorswap{
	public static void main(String[] args) {

		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println("\nthe goal here is to swap the values of bool1[true] and bool2[false] in place using \"xor\".");

		bool1 = (bool1 == bool2);//sets bool1 to the equality of bool1 and bool2, which is false.
		bool2 = (bool1 == bool2);//sets bool2 to the equality of bool1 and bool2, which is true.
		bool1 = (bool1 == bool2);//sets bool1 to the equality of bool1 and bool2, which is false.

		System.out.println("bool1 should now be false and bool2 should now be true. bool1 is ["+bool1+"] and bool2 is ["+bool2+"]. \n\n\n");

		int a =2345;
		int b = 654;

		a = a + b;//set a equal to the sum
		b = a - b;//set b equal to the sum minus itself, also known as a
		a = a - b;//set a equal to the the sum minus (the sum minus itself, also known as a). ANOTHER OPTION IS A-=B BUT THIS MAKES IT UNCLEAR AND MESSY

		System.out.println("a should be 654 and b should be 2345. a:"+a+". b:"+b+".");

		System.out.println("I FIGURED OUT THE IN-PLACE INTEGER SWAP BY MYSELF!\n\n\n");

		//what now.... n-count integer rotation???? string exchange?? ya cant add strings ya know

		String q = "Eddie Looked out the window.";
		String w = "He seemed surprised, yet sad, at what he saw.";

		q = q+"."+w; //q is equal to the sum
		w = q.substring(0, q.indexOf("."));//w is equal to the substring of q of 0 to all the way to where string w is found
		q = q.substring(q.indexOf(".")+1); // q is equal to the substring of itself from the first finding of w all the way to the end

		System.out.println("q should be He seemed surprised, yet sad, at what he saw.: "+q);
		System.out.println("w should be Eddie Looked out the window.: "+w);

		//n count rotation. the goal here is to give each variable the value of the variable before it. var1 should take on the value of var4.

	}
}