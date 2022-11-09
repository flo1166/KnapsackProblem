package knapsackProblem;

public class ItemTest {
	// control structure for knapsack problem
	public static void main(String[] args) {
		// input data
		double capacity = 16;
		double[] value = {8, 3, 9, 8, 2, 6, 4, 2};
		double[] weight = {4, 2, 7, 7, 2, 8, 6, 5};
		String[] name = {"Geg1", "Geg2", "Geg3", "Geg4", "Geg5", "Geg6", "Geg7", "Geg8"};

		// create item object to iterate
		Item[] item = new Item[value.length];
		
		int i;
		for (i = 0; i < (value.length); i++) {
			item[i] = new Item(name[i], weight[i], value[i]);
			item[i].display();
			}
		
		// initialize knapsack
		Knapsack knapsack = new Knapsack(capacity);
		
		// check if weight can be packed
		for(i = 0; i < item.length; i++) {
			knapsack.tryPack(item[i]);
			}
		
		// Output
		for(i = 0; i < knapsack.packed.length; i++) {
			System.out.println("Packed item " + (i + 1) + ": " + knapsack.packed[i]);
			}
		System.out.println("Total Value: " + knapsack.totalValue);
		}
}
