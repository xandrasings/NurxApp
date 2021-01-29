# NurxApp
Prescription Routing - Phone Screen - v4
Prompt
After a patient requests a new prescription, and our medical team has written a new prescription, our system must
automatically determine the cheapest way to fill a given order. This routing is subject to the following set of constraints:
●
●
●
A single Order can be fulfilled by multiple pharmacies, but a single OrderItem cannot be split across more than
one pharmacy
Assignments should contain OrderItems, not Orders, to allow an individual order to be fulfilled with a single
shipment by a single pharmacy or multiple shipments by multiple pharmacies
We want to minimize the total cost of fulfilling an order, which is determined by the inventory.cost x
orderItem.quantity
A simplified object model in UML is provided below that shows the relationships and types of your function. In a
language of your choosing, implement the assign(Order) function.
COMMENTARY
Please comment your implementation and make note of assumptions, trade-offs, and limitations in the architecture, as
well as any exceptions that the fulfillment assignment algorithm must consider.
If you have any questions, please do not hesitate to ask. Feel free to extend the model as needed, but take care not to
modify the specified requirements.
Object Model (Updated Nov 2020)
FAQ
Q: Are there tests available?
A: We are not evaluating your performance on a test suite. While we do ask that your code can be executed, and highly
recommend you test it in advance, we won't run a suite against it to measure performance or results.
Q: What tools can I use?
A: You can use any language of your choice, as well as anything available in standard and liberally licensed open
source libraries (e.g. MIT, Apache, etc.) Use of proprietary or paid services, including SaaS APIs, is not permitted.
Q: How do I submit?
A: When you are finished, create an archive of your solution and Email your recruiting contact. We'll ensure your next
interviewer has a copy of your solution before our meeting.
