public class BirthdayProblem{

	public static boolean match(){
		int [] arr = new int [23];

		for (int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*365);
		}

		for (int i=0; i<=arr.length; i++) {
			for (int q = i+1; q<arr.length; q++) {
				if (arr[i] == arr[q]){
				//System.out.println("yes, two people have the same birthday.");
				return true;
				}
			}
		}
		//System.out.println("no matches.");
		return false;
	}

	public static void main(String [] args){
		int count = 0;
		System.out.println("This program will print how many times out of a million that 2 people\nin a room of 23 have the same birthday. If it's true that the chances\nare more than 50%, as statisticians say, \nthen the number should be more than 500000...\n\n");
		for(int i=1; i<=1000000; i++){
			if (match()){
				count++;
			}
		}
		System.out.println("The result is " +count+".");
	}
}
