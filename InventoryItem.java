import java.io.*;
import java.math.*;
public class InventoryItem {

	private String drug;
	// bigdecimal is a better variable type for currency than float, due to float's inability to handle precision values and arithmetic
	// assumption: cost will never be 0. relevant to business logic in other classes.
	private BigDecimal cost; 

	public InventoryItem(String drug, float cost) {
		this.drug = drug;
		this.cost = new BigDecimal (Float.toString(cost));
	}

	public String getDrug() {
		return this.drug;
	}

	public BigDecimal getCost() {
		return this.cost;
	}

	public void print() {
		System.out.println(drug + " - " + String.valueOf(cost));
	}
}