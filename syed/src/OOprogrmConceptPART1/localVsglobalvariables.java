package OOprogrmConceptPART1;

public class localVsglobalvariables {

	
	//Global variable-----> class variable
	
	String name ="Rahamatullah";
	  int age = 29;
	 String cuntry ="Sweden";
	 	
	public static void main(String[] args) {
		String surname="syed";
		int i =10;
		System.out.println(i);
		System.out.println(surname);
		
		
// if i want to print the name given in GLOBAL/class variable i have to read them with obj
		
		
	localVsglobalvariables obj = new localVsglobalvariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.cuntry);
		
		}
public void sun() {
	
	int i=26;
	int j=23;
	double d=i+j;
	double d1=23.21;
	System.out.println(i);
	System.out.println(i+j);
	System.out.println(d+d1);
	
}


}

