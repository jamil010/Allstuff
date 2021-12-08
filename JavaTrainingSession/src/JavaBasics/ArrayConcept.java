package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {

		int[] num = new int[5];
		
		//One dimension array
		num[0] = 5;
		num[1]=  6;
		num[2]=  7;
		num[3]=  8;
		num[4]=  9;
		System.out.println(num[3]);
		System.out.println(num.length);
		for(int i= 0; i<num.length; i++) {
			System.out.println(num[i]);
			
			for(int j =1; j<num.length; j++)
	      System.out.println("numbers are["+1+"]="+num[j]);}
		
			
		// Two dimension array
			int k[][] = new int[4][4];
			
			 
			  k [0][0] = 10;
			  k [0][1] = 20;
			  k [0][2] = 30;
			  k [0][3] = 40;
			  
			  k [1][0] = 50;
			  k [1][1] = 60;
			  k [1][2] = 70;
			  k [1][0] = 80;
			  
			  k [2][0] = 900;
			  k [2][1] = 110;
			  k [2][2] = 120;
			  k [2][3] = 130;
			  
			  k [3][0] = 140;
			  k [3][1] = 150;
			  k [3][2] = 160;
			  k [3][3] = 170;
			 System.out.println(k.length);
				 
	 
	
	String name[] = {"imran","ali","yasir","faizan"};
	for(String s :  name) {
		System.out.println(s);
	
		
			
		}}}
		
	


