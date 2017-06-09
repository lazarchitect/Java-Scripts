public class GasTank{
	private double amount = 0.0;
	private double capacity;
	public GasTank(double x){
		this.capacity = x;
	}
	public void addGas(double x){
		this.amount+=x;
		if (this.amount>capacity){
			this.amount=capacity;
		}
	}
	public void useGas(double x){
		this.amount-=x;
		if (this.amount<0){
			this.amount=0;
		}
	}
	public boolean isEmpty(){
		if(this.amount<0.1){
			return true;
		}
		return false;
	}
	public boolean isFull(){
		if(this.amount>this.capacity-0.1){
			return true;
		}
		return false;
	}
	public double getGasLevel(){
		return this.amount;
	}
}