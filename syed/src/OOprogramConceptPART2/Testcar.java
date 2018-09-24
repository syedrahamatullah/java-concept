package OOprogramConceptPART2;

public class Testcar {

	public static void main(String[] args) {

//Static polymorphism.....> compile time polymorphism
		BMW b= new BMW();
		b.start();
		b.stop();
	    b.refuel();
		b.thfesafty();
		b.engine();
		
		System.out.println("--------");
		
		car c= new car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		
		System.out.println("---------");
		
		
		//top casting 
		car c1= new BMW();  
// child class obj can be refs byparent class ref..(or) var.. is called dynamic polymorphism 
		c1.start();
		c1.stop();
		c1.refuel();
		
		
		//dowm casting
		
		//BMW B =(BMW) new car();	
		}

}
