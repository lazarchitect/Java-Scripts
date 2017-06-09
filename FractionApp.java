
public class FractionApp {
	public static void main(String[] args) {
		/*
		Fraction f = new Fraction();   // calling the "default constructor"
		*/
		
		Fraction f = new Fraction(3,2);
		
		System.out.println("numerator = " + f.getNum());
		System.out.println("denominator = " + f.getDenom());
		
		Fraction f1 = new Fraction(3);  // 3/1
		Fraction f2 = new Fraction();   // 1/1
		
		//Fraction f3 = new Fraction(4,0);
		
		Fraction f5 = f.sum(f1);   // 3/2 + 3 is returned
		System.out.println("numerator = " + f5.getNum());
		System.out.println("denominator = " + f5.getDenom());
		
		Fraction f6 = new Fraction(f5); 
		f6.setNum(10);  // this changes f6's numerator, but not f5's
		
		Fraction f7 = f5;  // f7 is an alias for f5
		
		System.out.println("f5 = " + f5);  // f5.toString() is automatically called
		System.out.println("f6 = " + f6); 
		f6.add(f5);
		f6.simplify();
		System.out.println("f6 + f5 = " + f6);
		
		Fraction f8 = new Fraction(5,3);
		Fraction f9 = new Fraction(10,6);
		System.out.println("f8 == f9? " + f8.equals(f9));
		
		
	}

}
