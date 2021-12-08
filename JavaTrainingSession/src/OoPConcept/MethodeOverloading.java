package OoPConcept;

public class MethodeOverloading {

	public static void main(String[] args) {

		MethodeOverloading ob = new MethodeOverloading();
		ob.sum();
		
	}
	// Method overloading
	// same name method with different argument is called method overloading
 
  public static void sum() {
	  System.out.println("this is method with no argumant");
	  
  }
  public static void sum(int a) {
	  System.out.println("this method is with one argument");
	  
  }
  public static void sum(int b , int c) {
	  System.out.println("this methode is wit two argument");
  }
  
  
}



