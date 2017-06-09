/*public class Person{

	//fields
	private String name;
	private char sex;
	private int age;

	//constructor
	public Person(String name, int age, char sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	//getters
	public String getName(){
		return name;
	}
	public int getAge(){
		return age; 
	}
	public char getSex(){
		return sex; 
	}

	//setters
	public void setSex(char s){
		s = Character.toLowerCase(s);
		if (s=='m' || s=='f'){
			this.sex = s;
		}
		else{
			this.sex = 'f';
		}
	}
	public void setAge(int age){
		if (age>=0){
			this.age = age;
		}
		else{
			this.age = 0;
		}
	}
	public void setName(String name){
		this.name = name;
	}


	public String toString(){
		return name+" "+sex+" "+age;
	}

	//driver
	public static void main(String [] args){
		Person p = new Person("Bobo", 10, 'f');
		System.out.println(p);
		p.setName("KingKong");
		p.setAge(1234);
		System.out.println(p);
		System.out.println(p.getSex());
		System.out.println(p.toString());
	}


	







}

//creating an object thats a bank account. has values, and methods to affect these values.
*/
public class BankAccount{
	//the values
	private String name;
	private String ssn;
	private String dateOfCreation;
	private double balance;
	private double interest;//		[0,1]
	private double totalWithdrew;
	private char gender;


	public String toString(){
		return name+" "+ssn+" "+dateOfCreation+" " + balance+ " "+ interest+" " + totalWithdrew+" "+gender;
	}

	public static void main(String [] args){
		BankAccount eddie = new BankAccount("Eddie", 32.09, .99, "129-14-2523", 'm');

		eddie.setInterest(.87);
		System.out.println(eddie);
	}
	

	//constructor
	public BankAccount(String name, double balance, double interest, String ssn, char gender){
		this.name=name;
		this.interest=interest;
		this.ssn = ssn;
		this.gender = gender;
		this.dateOfCreation = "Start Date lol";//dont worry about this
	}
	public void withdraw(double amt){
		if (this.balance>=0){
			this.balance -=amt;
			totalWithdrew+=amt;
		}
	}
	//getters
	public double getwithdrawn(){return totalWithdrew;}
	public String getName(){return name;}
	

	public void setInterest(double interest){
		if(interest<=1 && interest>=0){
			this.interest = interest;
		}
	}
	public void payInterest(){
		balance += (balance*interest);
	}

}