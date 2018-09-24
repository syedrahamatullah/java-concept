package OOprogrmConceptPART1;

public class callbyvalANDcallbyref {
	int p;
	int q;

public static void main(String[] args) {
	
	callbyvalANDcallbyref obj=new callbyvalANDcallbyref();
	int x=10;
	int y=20;
obj.testsum(x, y); // call by value or pass by value

obj.p =50;
obj.q=60;
obj.swap(obj);
System.out.println(obj.p);
System.out.println(obj.q);
}


public int testsum(int a, int b) {
	a=30;
	b=40;
	int c=a+b;
	return c;
	
}
//call by reference or pass by reference
public void swap(callbyvalANDcallbyref t) {
int temp;
temp = t.p;
t.p=t.q;
t.q=temp;
}
}


