/*You MAY NOT assume valid inputs for non-constructor methods.

void setProduct(int slot, String product, double price): Make the given slot hold items of the specified kind of product, sold for the given price.
The initial quantity of the product in this slot should be zero. If the slot already held another kind of product, the old product should be removed
from this slot.

void restockProduct(String product, int quantity): Add the given quantity of the specified product to the vending machine. Put as many of the items
as possible into the first slot that has been designated to hold that particular kind of product (using setProduct()). If not all of the items will
fit into the first slot, put as many of the rest as possible into the second slot that holds that kind of product, etc. For partial credit, your
method should at least be able to find the first slot designated for the specified product and put all of the items there.

double getCashOnHand(): Return the amount of cash now in the vending machine (this amount should increase whenever an item is purchased).

int getQuantity(String product): Return the total number of items of the specified kind of product that are in the vending machine.
Remember that this product may be in more than one slot. If the product is not in the vending machine at all, simply return zero.

boolean buyItem(int slot): Attempt to buy one item from the given slot. Return true if successful.
*/

public class VendingMachine{//cs111 hw7, alongside vmd.java

	private String [] products;
	private double [] prices;
	private int [] slots;
	private double cash;
	private int maxperslot;

	public VendingMachine(int numslots, int maxperslot, double cash){//constructor
		slots=new int [numslots];
		prices=new double [numslots];
		products=new String [numslots];
		for (int i = 0; i<numslots; i++){
			slots[i]=0;
			prices[i]=0.0;
			products[i]="";
		}

		this.maxperslot = maxperslot;
		this.cash = cash;
	}

	public void setProduct(int slot, String product, double price){//setter
		if (slot>this.slots.length-1) {
			System.out.print("failure: that slot index is too high.");
			return;
		}
			this.products[slot] = product;
			this.prices[slot] = price;
	}




	public void restockProduct(String product, int quantity){//setter

		for (int i=0; i<slots.length; i++) {
			if (products[i].equals(product) && slots[i]<maxperslot) {
				slots[i]+=quantity;
				quantity=slots[i]-maxperslot;
				if (quantity>0) {
					slots[i]=maxperslot;
					continue;
				}
				else{
					break;
				}
			}
			else{
				continue;
			}
		}
		/*give the vending machine "quantity" "product"s. as many as possible should go in the first slot that hold this product, and then on to the next if needed.
		iterate through the slots. if it has the String as its product, add to it and substract from the int until the quantity of 0 or the slot is full. (nested loop here)
		if the slot is full, keep going onto the next slot. if you reach the end of the slots, stop.*/
	}

	public double getCashOnHand(){//getter that returns the amount of cash the machine is currently holding.
		return this.cash;
	}
	public int getQuantity(int slot){//getter that returns the number of items in the slot at index "slot".
		if (slot>slots.length-1){
			System.out.println("failure: index too high.");
			return -1;
		}
		return slots[slot];
	}

	public int getQuantity(String product){//getter that returns the number of "product"s in the machine. they can be in multiple slots, or nowhere.
		int total=0;
		for (int i=0; i<slots.length-1; i++){
			if (products[i].equals(product)) {
				total+=slots[i];
			}
		}
		return total;
	}

	public boolean buyItem(int slot){//attempt to buy an item from the slot at index "slot". return true if successful.
		if (slot<slots.length-1 && slot>=0 && slots[slot] > 0){
			slots[slot]-=1;
			cash+=prices[slot];
			return true;
		}

		return false;
	}
}