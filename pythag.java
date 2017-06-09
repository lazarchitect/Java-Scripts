public class pythag{//project euler number 9.
	public static void main(String[] args) {
		System.out.println("This program will find a pythagorean triple a^2 + b^2 = c^2 such that a+b+c=1000 (there exists only one such set).");
		int a, b, c;
		for (a=1; a<=1000; a++){
			if (a%10==0) {
				System.out.println("outermost loop is currently at "+a);
			}
			for (b=1; b<=1000; b++){
				for (c=1; c<=1000; c++){
					if (isThousand(a,b,c) && isPyth(a,b,c)){
						System.out.println("A:"+a+". B:"+b+". C:"+c+".");
						System.out.println(a*b*c);
						return;
					}
				}
			}
		}

	}

	public static boolean isThousand(int a, int b, int c){
		return (a+b+c==1000);
	}
	public static boolean isPyth(int a, int b, int c){
		return ((a*a)+(b*b)==(c*c));
	}


}