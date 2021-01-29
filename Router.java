import java.io.*;
import java.math.*;
import java.util.*;
public class Router {


	// this (and other member variables in this exercise) would work well as a reference.
	// this would prevent some objects from being created redundantly.
	// the documentation didn't seem to specify this, otherwise I think I would have implemented it that way!
	private List<Pharmacy> pharmacies;

	public Router() {
		pharmacies = new ArrayList<Pharmacy>();
	}

	public void addPharmacy(Pharmacy pharmacy) {
		pharmacies.add(pharmacy); 
	}

	// assumption: order item will be omitted from the assignments if no pharmacy has it in their inventory
	public List<Assignment> assign(Order order) {
		List<Assignment> assignments = new ArrayList<Assignment>();

		for (OrderItem orderItem : order.getItems()) {		

			BigDecimal lowestCost = BigDecimal.ZERO;
			Pharmacy lowestCostPharmacy = null;

			for (Pharmacy pharmacy : pharmacies) {
				BigDecimal cost = pharmacy.estimateOrderItemCost(orderItem);

				if (cost != BigDecimal.ZERO && (lowestCost.compareTo(BigDecimal.ZERO) == 0 || cost.compareTo(lowestCost) < 0 )) {
					// new lowest cost was found
					lowestCost = cost;
					lowestCostPharmacy = pharmacy;
				}
			}

			if (lowestCostPharmacy != null) {

				// check if pharmacy already exists in assignments
				boolean pharmacyAssigned = false;
				for (Assignment assignment : assignments) {
					if (assignment.getPharmacy() == lowestCostPharmacy) {

						// if so, add order item to that assignment
						assignment.addItem(orderItem);
						pharmacyAssigned = true;
						break;
					}
				}
				
				// if not, create new assignment for this pharmacy
				if (!pharmacyAssigned) {
					assignments.add(new Assignment(lowestCostPharmacy, orderItem));
				}
			} 
		}

		return assignments;
	}

	public void print() {
		for (Pharmacy pharmacy : pharmacies) {
			pharmacy.print();
		}
	}
}