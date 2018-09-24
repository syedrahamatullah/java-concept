package OOprogrmConceptPART1;

public class FunctionsINjava {

	public static void main(String[] args) {

	FunctionsINjava obj= new FunctionsINjava(); 
// one objcet will be created, obj is the reference variable, refering to this obj
// after creating the object, the copy of all Non-Static methos will be given to this Object
	
	obj.test();
	int l=obj.add();
 System.out.println(l);	

 int c= obj.add();
 System.out.println(c);
 
 String s = obj.abc();
 System.out.println(s);

 int d=obj.div(30,10);
 System.out.println(d);
 
 
 System.out.println("i love java");
 

	}
		
//Non-Static methods
	public void test() {
			System.out.println("test method");//no input, no output
		}
		
//return type= int
	public int add() {  // no input some output
		System.out.println("add method");
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
		
	}
		
//return type ---> String
	
	public String abc() {
    System.out.println("Selenim");
	String s= "Selenium";
	return s;
	
	}	
	
	
//return type ----> int
	
	public int div(int x, int y) {
		System.out.println("division method");// some input, some output
	int d= x/y;
	
	return d;
	
	}

}
