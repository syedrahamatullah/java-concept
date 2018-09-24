package OOprogrmConceptPART1;

public class Car {
	//class varriable 
			int mod;
			int wheel;
	public static void main(String[] args) {
// new Car---> this is the Object of Car class

		System.out.println("before assigning the refference");
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod=2015;
		a.wheel=4;
		
		b.mod=2016;
		b.wheel=4;
		
		c.mod=2000;
		c.wheel=4;
		
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);  
		
		
		System.out.println("After assigning the reference");
	
		a=b;
		b=c;
		c=a;
		
		a.mod=10; 
	    System.out.println(a.mod);//10
		c.mod=20;
	    System.out.println(a.mod);//20
		System.out.println(c.mod);//20
	
	
	}
	
	

}
