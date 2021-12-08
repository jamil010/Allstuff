package OoPConcept;


public class NonStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for non static method to static method we need to make the object of the class
		
		NonStaticMethod obj = new NonStaticMethod();
		obj.Monthly(0, 0, null);
		
		
		

	}
	
	public void Monthly(int income, int expense, String month) {
	int	profit = income - expense;
	System.out.println("This is profit for "+month+"="+profit);
	
	}

}
