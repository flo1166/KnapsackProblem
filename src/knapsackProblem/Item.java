package knapsackProblem;

public class Item {
	
	String name;
	double weight;
	double value;
	boolean packingDecision;
	
	public Item(String name, double weight, double value) {
		this.name = name;
		this.weight = weight;
		this.value = value;
		}
	
	public void display(){
		System.out.println("Name: " + this.name);
		System.out.println("value: " + this.value);
		System.out.println("weight: " + this.weight);
		}
}
