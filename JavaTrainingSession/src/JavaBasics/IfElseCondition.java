package JavaBasics;

public class IfElseCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 60;
		int b = 80;
		int c = 90;
		if(a==b) {
			 System.out.println("Both are equals");
		}else {
			System.out.println("Both are equals");
		}
			//if nasted condition
			if(a > b & b> c) {
				System.out.println("a is greater");
			} else if(b > c) {
				System.out.println("b is greater");
			}else {
				System.out.println("c is greater");	
				
		}
		// if else condition
           int percentage= a+b+c;
           int avg = percentage/3;
           System.out.println(avg);
           if(avg>=90 & avg<=100) {
        	   System.out.println("u got grade :A");}
           else if(avg >= 80 & avg<= 89) {
        	   System.out.println("u got grade :B");
           }else if(avg>= 70 & avg<=79)  {
        	   System.out.println("u got grade :c");
           }else {
        	   System.out.println("u are fail");
	
		
        	   
           }
           
          
           
	}

}
