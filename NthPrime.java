public class NthPrime{
	public static void main(String[] args){
	
	System.out.println("This program, using your input, returns the prime of that ordinate.");
	System.out.println("Enter a prime's ordinate.");
	int input = IO.readInt();
	boolean print = true;
	
	int i=2;
	
	while (input < 1){
	IO.reportBadInput();
	input = IO.readInt();
	}
	int prime = 1;
	int count = 0;
	while(count < input){
		prime++;
		for(i=2;i<= prime;i++){
			if(prime % i == 0){
				break;
			}
		}
		if (i == prime){
			count = count + 1;
		}
	}	
	IO.outputIntAnswer(prime);
		
	}	
}	