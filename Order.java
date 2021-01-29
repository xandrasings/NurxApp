import java.io.*;
import java.util.*;
public class Order {

	private List<OrderItem> items;

	public Order() {
		items = new ArrayList<OrderItem>();
	}

	public void addOrderItem(OrderItem orderItem) {
		items.add(orderItem); 
	}

	public List<OrderItem> getItems() {
		return items; 
	}

	public void print() {
		for (OrderItem orderItem : items) {
			orderItem.print();
		}
	}
}