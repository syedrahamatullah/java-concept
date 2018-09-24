package OOprogramConceptPART2;

public class HSBCbank implements USbank, swedbank { // we are achiving multiple inheretence
	
	// this concept is also called (Is-a) Relationship

	
//if a class is implementing any interface, then its mandatory to define/ pverride all the methods of interface
	
// overriding for US bank 	
	public void credit() {
		System.out.println("HSBC...credit");
}
	public void debit() {
		System.out.println("HSBC....debit");
	}
	public void transfermoney() {
		System.out.println("HSBC..transfermoney");
	}
	
//HSBC----own methods 
	public void educationalloan() {
		System.out.println("HSBC...edu..loan");
	}
public void carloan() {
	System.out.println("HSBC....carloan");
}
//overriding forswedbank

public void mutualfund() {
	System.out.println("HSBC.....mutualfund");
}
}

