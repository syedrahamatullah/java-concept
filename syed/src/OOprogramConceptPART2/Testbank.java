package OOprogramConceptPART2;

public class Testbank {

	public static void main(String[] args) {
System.out.println(USbank.min_bal);

HSBCbank hs = new HSBCbank();
hs.credit();
hs.debit();
hs.transfermoney();
hs.educationalloan();
hs.carloan();


//dynamic polymorphism
// child class object can be refered by parent interface reference variable

USbank b= new HSBCbank();
b.credit();
b.debit();
b.transfermoney();

// for swedbank

swedbank sb= new HSBCbank();
sb.mutualfund();

}

}
