import java.io.*;
import java.math.*;
import java.util.*;
public class Pharmacy {

	private String name;

	// This variable could work well as a hash map, for example with the name of the drug as a key and the InventoryItem as the associated value
	// This would allow for efficient constant time access to a given inventory item, as well as an efficient method to check whether an inventory item is in a given pharmacy's inventory.
	List<InventoryItem> inventory;

	public Pharmacy(String name) {
		this.name = name;
		this.inventory = new ArrayList<InventoryItem>();
	}

	public void addInventoryItem(InventoryItem inventoryItem) {
		inventory.add(inventoryItem); 
	}

	// This method returns 0 in the event that the pharmacy does not have this in inventory
	// Some alternatives to this approach:
		// - this method could be conditionally called after another method that first confirms whether a pharmacy has this order item in inventory
		// - this method could throw an exception indicating that no inventory was found. its calling methods (such as Router.assign) could catch that exception and skip that pharmacy for that item.
	// This method returns a TOTAL cost for this order item given the quantity specified in the OrderItem Object
	// This method assumes that the list only contains a given inventory item ONCE. If this assumption is correct, it's another reason a hashmap might be a good fit
	public BigDecimal estimateOrderItemCost(OrderItem orderItem) {
		for (InventoryItem inventoryItem : inventory) {
			if (inventoryItem.getDrug() == orderItem.getDrug()) {
				return inventoryItem.getCost().multiply(new BigDecimal(orderItem.getQuantity()));
			}
		}

		// order drug not found in inventory!
		return BigDecimal.ZERO;
	}

	public void print() {
		System.out.println(name);
		for (InventoryItem inventoryItem : inventory) {
			inventoryItem.print();
		}
	}

	public void printName() {
		System.out.println(name);
	}
}