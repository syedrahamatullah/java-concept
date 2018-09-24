package syed;
import java.util.Hashtable;
public class HashtableConcept {

	public static void main(String[] args) {

	Hashtable h= new Hashtable ();
	h.put("A", "test");
	h.put("B", "hello");
	h.put("C", "world");
	
	System.out.println(h.size());
	
	h.put(1, "tom");
	h.put(3, 100);
	h.put(2, 300);
	
	System.out.println(h.size());
	System.out.println(h.get("C"));
	System.out.println(2);
	System.out.println(h.get(1));
	
	
	
		
	}

}
