public class LuckySevens{
	public static void main(String[] args){
	
	System.out.println("this program will tell how many 7s are in the integers between 2 limits you set.");
	int sevens = 0;

	System.out.print("lower limit? ");
	int lowlim = IO.readInt();

	System.out.print("upper limit? ");
	int uplim = IO.readInt();
	
	if (lowlim >= uplim){
	IO.reportBadInput();
	return;
	}
		
	while(lowlim <= uplim){								
		String i = Integer.toString(lowlim);
		int digit = i.length();
		digit -= 1;
			while(digit > -1){
				if ('7' == i.charAt(digit)){
					sevens++;
				}
				digit--;
			}
			lowlim++;
	}
	IO.outputIntAnswer(sevens);	
	}

}	