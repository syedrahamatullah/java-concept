package OOprogrmConceptPART1;

public class MethodOVERloading {

	public static void main(String[] args) {

		MethodOVERloading obj = new MethodOVERloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10,5);
	
	}
	
	public static void main (int p) {
	}
	
	public static void main(int q, int h) {
	}
	
	
	public void sum() {    // 0 input parameters
	System.out.println("sum method ...zero input parameters");
	}
	
	public void sum(int i) {
System.out.println("sum with one input parameter ");
}

	public void sum (int k, int l) { // 2 input parameters
		System.out.println("sum of 2 input parameters");
		System.out.println(k+l);
	}
		
	}