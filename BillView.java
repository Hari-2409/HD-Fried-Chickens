 
 import java.util.ArrayList;
 class BillView {
	ArrayList<Addlist> item = new ArrayList<>();

	public void additem(String name, double amount, int q, double fiam) {
		item.add(new Addlist(name, amount, q, fiam));
	}

	public void printBill() {
		double total = 0;
		System.out.println("🎊🎊🎊🎊BILL🎊🎊🎊🎊");
		for (Addlist i : item) {
			
			System.out.println("Food ordered : " + i.name + " || Amount : " + i.amount + " || Quantity : " + i.q
					+ " || Final Amount : " + i.fiam);
			total += i.getTotal();

		}
		System.out.println("You will have 3 % GST and also enjoy our 5 % discount available");
		total = total - (total * 2) / 100;
		System.out.println("Your final amount : " + total);
	}
	

}
