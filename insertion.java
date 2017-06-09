public class insertion{
	public static void main(String [] args){

	System.out.println("Insertion Sort:");
	int [] a = {10, 23, 3, 41, 9, 16, 20, 11, 3, 1};

	for (int i=1; i<a.length; i++){
		int temp = a[i];
		for (int j=i-1; j>=0 && temp<a[j]; j--) {
			a[j+1]=a[j];
			a[j+1]=temp;
		}
	}

	for (int z=0; z<a.length; z++) {
			System.out.println(a[z]);
	}

	}
}