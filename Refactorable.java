package refactoring;

public class Refactorable {
	private MyCollection _orders = new MyCollection();
	private String _name = "Customer Name";
	
	//Main code. NO refactoring done yet. Next we will apply the extract method. 
	
	void printOwing(){
		Enumeration e = _orders.elements();
		double outstanding = 0.0;
		
		// print banner
		System.out.println("**************************************");
		System.out.println("************ Customer Owes ***********");
		System.out.println("**************************************");
		
		// calculate outstanding
		while(e.hasMoreElements()){
			Order each = (Order) e.nextElement();
			outstanding += each.getAmount();	
		}
		// print details 
		System.out.println("name: " + _name);
		System.out.println("amount: " + outstanding);
	}
}
