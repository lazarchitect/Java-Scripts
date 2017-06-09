class Bus{
	private static String condition = "New";
	private static int timesDriven = 0;
	public Bus(String make){
		make = make;
		this.timesDriven = 0;
	}
	public static void changeMake(String make){//setter
		make = make;
	}
	public static void drive(){
		if (timesDriven++==1){condition = "Like New";}
		else if (timesDriven==2){condition="Slightly Used";}
		else if (timesDriven==3){condition="Used";}
		else if (timesDriven==4){condition="Very Used";}
		else{condition="Old";}
	}
	public static void main(String[] args) {
		Bus GreyHound = new Bus("Big");
		GreyHound.changeMake("Long");
		GreyHound.drive();
		GreyHound.drive();
		System.out.println(GreyHound.timesDriven);
		GreyHound.drive();
		System.out.println(GreyHound.condition);
	}
}