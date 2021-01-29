import java.io.*;
public class OrderItem {

	private String drug;
	private int quantity;

	public OrderItem(String drug, int quantity) {
		this.drug = drug;
		this.quantity = quantity;
	}

	public String getDrug() {
		return this.drug;
	}

	// assumption: quantity is positive
	public int getQuantity() {
		return this.quantity;
	}

	public void print() {
		System.out.println(String.valueOf(quantity) + " x " + drug);
	}
}