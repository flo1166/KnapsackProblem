package knapsackProblem;

public class Knapsack {
	
	String[] packed;
	double capacity;
	int totalValue;
	
	public Knapsack(double capacity) {
		this.capacity = capacity;
		this.packed = new String[0];
	}
	
	public void pack(String name) {
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
	
	public boolean weightCheck(Item item) {
		if (item.weight <= this.capacity) {
			this.capacity -= item.weight;
			this.totalValue += item.value;
			return true;
		} else {
			return false;
		}
	}
}

