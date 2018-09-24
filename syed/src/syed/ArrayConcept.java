package syed;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// one dimension array	
		
//array: to store similar data type values in a array variable
// Lowest bound/index = 0
//upper dound/index = n-1 ( n is the size of the array)
/*Advantage of array:
 we can store multiple values in a single varaible with similar data type
 Disadvantage of array:
 1)Size is fixed called static array--> to overcome this problem we use (collections-->arraylist-->hashtable) called dynamic array 
 2) Store only similar data types --->to overcome this problem we use Object array*/

		
		int i[]=new int [4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[2]);
		System.out.println(i[3]);
        
		//System.out.println(i[4]); // Error: Array indexout of bounds exception		
		
		System.out.println(i.length);  //size/length of array
		
// prrint all values od array: use for loop
		
for(int j=0;j<i.length;j++) {
	System.out.println(i[j]);
}
// 2. double arrays

	
	double d[]= new double[3];
	d[0]=12.33;
	d[1]=13.44;
	d[2]=45.55;
	System.out.println(d[2]);
	
// 3. char array	
		
	char c[]= new char[3];
	c[0]= 'q';
	c[1]=2;
	c[2]='@';

	System.out.println(c.length);
	System.out.println(c[2]);
	
// 4. boolean array
	
	boolean b[]= new boolean[2];
	        b[0]=true;
	        b[1]=false;
	        
// 5.String array
	        
	 String s[]= new String[3];
	        s[0]="test";
	        s[1]="hello";
	        s[2]="world";
	        
	 System.out.println(s[0]);
	 System.out.println(s.length);
	 
	 //Object array : Object is a super class	 
	 Object ob[]= new Object[6];
	        ob[0]= "syed";
	        ob[1]=12;
	        ob[2]= "1988/07/27";
	        ob[3]=52.32;
	        ob[4]='A';
	        ob[5]="India";
	        System.out.println( ob[0]);	 
	        System.out.println(ob[2]);
	        System.out.print("came from  "); 
	       System.out.println(ob[5]);
	}
	
}
