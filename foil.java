import java.util.Scanner;
public class foil{
	public static void main(String[] args) {
		System.out.println("This program will foil a pair of roots \"(ax-b)(cx-d)\". Input the whole string formatted perfectly.");

		Scanner one = new Scanner (System.in);
		String s = one.nextLine();
		
		int startparen = 0;
		int endparen = 0;
		int plus = 0;
		int exes = 0;
		
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i)=='(') {
				startparen++;
			}
			if (s.charAt(i)==')') {
				endparen++;
			}
			if (s.charAt(i)=='+') {
				plus++;
			}
			if (s.charAt(i)=='x') {
				exes++;
			}
		}
		if(startparen!=2 || endparen!=2 || exes!= 2 || plus>2){
			System.out.println("bad formatting");
			return;
		}
		
		for (int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='(' && s.charAt(i+1)=='x'){
				s = s.substring(0, i+1) + "1" + s.substring(i+1);
			}
		}
		System.out.println("this is what we're workin with: "+s);
		
		
		
		double a = Double.parseDouble(s.substring(1,s.indexOf('x')));
		System.out.println("a: "+a);
		
		double b = Double.parseDouble(s.substring(s.indexOf('x')+2, s.indexOf(')')));
		if (s.charAt(s.indexOf('x')+1)=='-'){
			b*= -1;
		}			
		System.out.println("b: "+b);
		
		endparen = s.indexOf(')');
		
		double c = Double.parseDouble(s.substring(s.indexOf(')')+2,s.indexOf('x', endparen)));
		System.out.println("c: "+c);
		
		double d = Double.parseDouble(s.substring(s.indexOf('x',endparen)+2, s.indexOf(')',endparen+1)));
		if (s.charAt(s.indexOf('x', endparen)+1)=='-'){
			d*= -1;
		}
		System.out.println("d: "+d);
		
		//(ax+b)(cx+d)
		
		System.out.println(
			nonzero((a*c), "x^2")
			+
			" "
			+
			nonzero(isNeg((b*c)+(a*d)), Math.abs((b*c)+(a*d)), "x")
			+
			" "
			+
			nonzero(isNeg(b*d),Math.abs(b*d), "")
			);
	}
	public static String isNeg(double x){
		if (x<0) {return "-";
		}
		else{return "+";}
	}
	public static String nonzero(String isNeg, double x, String s){
		if(x==0){return "";
		}
		else{return isNeg + " " + x + s;}
	}
	public static String nonzero(double x, String s){
		if(x==0){return "";}
		else{return x + s;}
	}
	/*public static void ifOne(int x){
		if (x==1) {}
		else{System.out.println(x);}
	}*/
}