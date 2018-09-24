package OOprogrmConceptPART1;

public class staticANDnonstaticConcept {
	
//global var: the scope of the global vars.. will be available accross all the functions with some condition

	
	String name = "syed"; //non static globaö var
	static int age= 29;   //static global var

	public static void main(String[] args) {
// how to call static method and var..
		//1. direct call
		sum();
		
       //2. calling by classname
		
		staticANDnonstaticConcept.sum();
		System.out.println(age);
		System.out.println(staticANDnonstaticConcept.age);
		
//how to call non static method and varriable
		
		staticANDnonstaticConcept obj=new staticANDnonstaticConcept();
        obj.sendmail();
        System.out.println(obj.name);
		
// can we access static method by using object reference? 
// YES but not a good practice
        obj.sum();
	
	}

	
	public void sendmail() {
		System.out.println("sendmail method");
	}
	public static void sum() {
		System.out.println("sum method");
	}
}
