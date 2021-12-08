package JavaBasics;

public class Loops {

	public static void main(String[] args) {
		
		
		// While loop
		
   int i = 1;
   while (i<=10) {
	   System.out.println(i); 
	     i++; 
   }
	     System.out.println("=======================");
	
   int b = 10;
    while ( b >= 1) {
    	System.out.println(b);
    	b--;
    	 }
    System.out.println("=====================");
    // do loop
    int c = 1;
    do {
    	System.out.println(c);
    	c++;
    }while(c<=10);
	
   System.out.println("==============="); 
   // For Loop
    for(int d =1; d<=9 ; d++) {
    	System.out.println(d);
    }
    //  Enhanced loop
    int e [] = {10, 20,30,40,50};
    for(int s :e) {
    	System.out.println(s);
    }
    
    
    
	}}


