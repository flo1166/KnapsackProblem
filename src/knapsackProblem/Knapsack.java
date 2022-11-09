package knapsackProblem;

public class Knapsack {
	
	String[] packed;
	double capacity;
	int totalValue;
	
	// Constructor
	public Knapsack(double capacity) {
		this.capacity = capacity;
		this.packed = new String[0];
	}
	
	// method to try to pack
	public boolean tryPack(Item item) {
		if (weightCheck(item)) {
			pack(item.getName());
			return true;
		} else {
			return false;
		}
	}
	
	// method to pack an item
	private void pack(String name) {
		int i;
		
		int lenPacked = packed.length + 1;
		String[] newPacked = new String[lenPacked];
		
		if (lenPacked != 1) {
			for (i = 0; i < (lenPacked - 1); i++) {
				newPacked[i] = packed[i];
			}
		}
		
		newPacked[lenPacked - 1] = name;
		this.packed = newPacked;	
	}
	
	// method to check if weight can be packed
	private boolean weightCheck(Item item) {
		if (item.getWeight() <= this.capacity) {
			this.capacity -= item.getWeight();
			this.totalValue += item.getValue();
			return true;
		} else {
			return false;
		}
	}
}

