public class divider{//for project euler. wanted to find the lowest number divisible by 1-20.

	public static boolean isDivis(double x){
		for (double i=2.0; i<21.0; i++){
			if (x%i!=0.0){
				return false;
			}
		}
		return true;
	}

	public static void main(String [] args){//count up. when a number is divisible by 1 through 20 inclusive, print it and return.

		double num = 1.0;
		while(isDivis(num)==false){
			num++;
		}
		System.out.print(num);


	}//main
}//class 