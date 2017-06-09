//Compare two strings using O(n) time with constant space.

class comparer{
	public static void main(String[] args) {
		
		String a = "Eddie";
		String b = "Lazar";
		
		System.out.println("The statement \"\'"+a+"\' and \'"+b+"\' are identical\" is "+ comp(a,b)+".");
		
		
	}
	static boolean comp(String a, String b){
		if(a.length()==0 && b.length()==0){
			return true;
		}
		if(a.length()==0 || b.length()==0){
			return false;
		}
		if(a.charAt(0)==b.charAt(0)){
			return comp(a.substring(1),b.substring(1));
		}
		return false;
	}
}