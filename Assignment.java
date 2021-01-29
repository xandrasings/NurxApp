import java.io.*;
import java.util.*;
public class Assignment {

	private Pharmacy pharmacy;
	private List<OrderItem> items;

	public Assignment(Pharmacy pharmacy, OrderItem item) {
		this.pharmacy = pharmacy;
		this.items = new ArrayList<OrderItem>();
		items.add(item);
	}

	public Pharmacy getPharmacy() {
		return this.pharmacy;
	}

	public void addItem(OrderItem orderItem) {
		items.add(orderItem);
	}

	public void print() {
		pharmacy.printName();
		for (OrderItem orderItem : items) {
			orderItem.print();
		}
	}
}