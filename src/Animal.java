
/*
 * This is the parent class. Also called the super class
 */
public class Animal {
	//prints for all classes
	public Animal() {
		System.out.println("\nA new animal has been created!");
	}
	//default methods to print default strings
	public String sleep() {
		return "An animal sleeps...";
	}
	public String eat() {
		return "An animal eats...";
	}
}

