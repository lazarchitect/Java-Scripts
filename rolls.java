public class rolls{
	public static void main(String [] args){

	System.out.print("How many dice?   ");
	int x = IO.readInt();
	int a;

	for (int i=1; i<=x; i++) {
		a = 1+(int)(Math.random()*6);
		System.out.println("Die #"+i+" came out " +a);
	}



	}
}