package refactoring;

public class Refactorable {
	private MyCollection _orders = new MyCollection();
	private String _name = "Customer Name";
	
	//extract method applied (part-3) 
	
	void printOwing(){
		Enumeration e = _orders.elements();
		double outstanding = 0.0;
		
		// printBanner method extracted 
		printBanner();
		
		// calculateOutstanding method extracted
		outstanding = calculateOutstanding(e, outstanding);
		
		// printDetails method extracted 
		printDetails(outstanding);
	}

	public double calculateOutstanding(Enumeration e, double outstanding) {
		while(e.hasMoreElements()){
			Order each = (Order) e.nextElement();
			outstanding += each.getAmount();	
		}
		return outstanding;
	}

	public void printDetails(double outstanding) {
		System.out.println("name: " + _name);
		System.out.println("amount: " + outstanding);
	}

	public void printBanner() {
		System.out.println("**************************************");
		System.out.println("************ Customer Owes ***********");
		System.out.println("**************************************");
	}
}
