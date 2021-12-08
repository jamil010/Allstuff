package OoPConcept;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Parts of method
		
		1-    Access modifier  (2) static  (3) Method name  */
		
		CompanyProfit();
		Monthly(10000, 4000, "january");
	}
	
	public static void CompanyProfit() {
		
		int incom = 100000;
		int expense = 40000;
		int profit = incom-expense;
		System.out.println(profit);
		
	}
	public static void Monthly(int income, int expense, String month) {
	int	profit = income - expense;
	System.out.println("This is profit for "+month+"="+profit);
	

	}
	public void evan() {
		System.out.println("evan method");
	}

}
