public class collatzer{//FOR PROJECT EULER. mission statement explains all.
	public static void main(String [] args) throws InterruptedException{
		System.out.println("This program takes the Collatz Conjecture and finds the numeral with the longest collatz chain between 0 and a million. Hold on...");
		double count = 0.0;
		double largest=0.0;
		double q;
		double x=1.0;
		for(x=1.0;x<1000000.0;x++){
			if (x%100000==0) {
				System.out.println(x+". ");
			}
			q=x;
			count=0.0;
			while (q!=1.0){
				if (q%2.0==0.0){
					q/=2.0;
				}
				else {
					q=(q*3.0)+1.0;
				}
				count++;
			}
			if(count>largest){
				largest=count;
				System.out.println("The new largest count is "+largest+". The starter value for that count is "+x+".");
			}
		}
	}
}