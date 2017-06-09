import java.util.Scanner;
public class Alph{//ALPHABETIZING A STRING ARRAY VIA SELECTION SORT
	public static void main(String [] args){

		System.out.println("This program takes multiple strings as input. enter the number of strings you want.");

		Scanner one = new Scanner(System.in);

		int i = 0;
		System.out.println("Now, enter all the strings you want to alphabetize. Enter the empty string to finish.");
		String [] a=new String [4];
		String looper = one.nextLine();

		while(!(looper.equals(""))){
			a[i] = looper;
			i++;
			looper = one.nextLine();
		}

		//SORTING GOES HERE
		//selection sort logic: iterate through, find first alphabetically. switch its place with earliest. continue starting at second index.


		int l,j,min;
		String temp;
		for (j = 0; j < a.length-1; j++) {
    		min = j;
    		for (l = j+1; l < a.length; l++) {
        		if (a[l].equals(a[min])) {
            		min = l;
        		}
    		}
    		if ( min != j ) {
        		temp = a[j];
        		a[j] = a[min];
        		a[min] = temp;
    		}
		}


		System.out.println("Here is your alphabetized list.");
		for (int s=0; s<i; s++){
			System.out.print(a[s]);
			if (!(s==i-1)) {
				System.out.print(", ");
			}
		}


	}
}