package knapsackProblem;

public class Item {
	
	private String name;
	private double weight;
	private double value;
	
	// getter for name
	public String getName() {
		return name;
	}
	
	// getter for weight
	public double getWeight() {
		return weight;
	}
	
	// getter for value
	public double getValue() {
		return value;
	}
	
	// Constructor
	public Item(String name, double weight, double value) {
		this.name = name;
		this.weight = weight;
		this.value = value;
		}
	
	// Output displayed
	public void display(){
		System.out.println("Name: " + this.name);
		System.out.println("value: " + this.value);
		System.out.println("weight: " + this.weight);
		}
}
