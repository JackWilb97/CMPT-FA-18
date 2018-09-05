/**
 * Demonstration of using a Bag ADT
 * 
 * @author greg
 *
 */
public class UseBag {

	public static void main(String[] args) {
		Bag bag = new ArrayListBag();
		
		System.out.println("Adding apples");
		bag.add("apples");
		
		System.out.println("Adding bananas");
		bag.add("bananas");
		
		System.out.println("Adding cherries");
		bag.add("cherries");
		
		System.out.println("Adding donuts");
		bag.add("donuts");

		System.out.println("There are " + bag.getSize() + " items in the bag");
		
		bag.remove("donuts");
		
		if (bag.contains("donuts")) {
			System.out.println("The bag contains donuts");
		}
		else {
			System.out.println("Sadly the bag does not contain donuts");
		}
		
		if (bag.contains("bananas")) {
			System.out.println("The bag contains bananas");
		}
		else {
			System.out.println("Sadly the bag does not contain bananas");
		}
		
		System.out.println("There are " + bag.getSize() + " items in the bag");
	}

}
