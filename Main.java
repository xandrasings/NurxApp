import java.io.*;
import java.util.*;
public class Main {

	public static void main(String args[]) {

		// below is a test case implementation!

		Order myOrder = new Order();
		myOrder.addOrderItem(new OrderItem("Dumatril", 7)); // cheapest at sketchmart
		myOrder.addOrderItem(new OrderItem("Kneesacil", 3)); // cheapest at bigstore
		myOrder.addOrderItem(new OrderItem("Lexaloft", 5)); // not sold anywhere
		myOrder.addOrderItem(new OrderItem("Boldesol", 5)); // only sold at bigstore

		Pharmacy waldrug = new Pharmacy("Waldrug");
		waldrug.addInventoryItem(new InventoryItem("Dumatril", 4.99f));
		waldrug.addInventoryItem(new InventoryItem("Kneesacil", 5.99f));

		Pharmacy bigStore = new Pharmacy("BigStore");
		bigStore.addInventoryItem(new InventoryItem("Kneesacil", 4.99f));
		bigStore.addInventoryItem(new InventoryItem("Boldesol", 10.99f));

		Pharmacy sketchMart = new Pharmacy("SketchMart");
		sketchMart.addInventoryItem(new InventoryItem("Dumatril", 2.99f));
		sketchMart.addInventoryItem(new InventoryItem("Kneesacil", 7.99f));
		sketchMart.addInventoryItem(new InventoryItem("Tyledrol", 1.99f));

		Router myRouter = new Router();
		myRouter.addPharmacy(waldrug);
		myRouter.addPharmacy(bigStore);
		myRouter.addPharmacy(sketchMart);

		List<Assignment> assigments = myRouter.assign(myOrder);
		for (Assignment assigment : assigments) {
			assigment.print();
		}
	}
}