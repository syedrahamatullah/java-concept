package OOprogrmConceptPART1;

public class wrapparclass {

	private static final String Interger = null;


	public static void main(String[] args) {
// data conversion-string, integer, double, boolean
	
String x="100";
System.out.println(x+20);

//data conversion: string to integer

int i = Integer.parseInt(x);
	System.out.println(i+20);
	
// string to double
	
	String y= "12.33";
double d= Double.parseDouble(y);
System.out.println(11+y);

// string to booelan

String z ="true";
boolean b=Boolean.parseBoolean(z);
System.out.println(z);
	
// integer to striig 
int j=200;
System.out.println(j+20);
	String s= String.valueOf(j);
	System.out.println(j+20);
	}

}
