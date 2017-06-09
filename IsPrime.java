public class IsPrime{
	public static void main(String [] args){

	//read integer input from user. make sure its positive.
	System.out.println("Enter integer value greater than 1");
	int x = IO.readInt();
	boolean der = true;
	while (x<2){
		System.out.print("input must be greater than 1");
		System.out.print("Enter integer value");
		x=IO.readInt();
	}
	for (int q=2; q<=x/2; q++){
		if (x%q==0){
			der=false;
		}
		else{

		}
	}
	if (der){
		IO.outputStringAnswer("prime");
	}
	else{
		IO.outputStringAnswer("not prime");
	}
	}
}