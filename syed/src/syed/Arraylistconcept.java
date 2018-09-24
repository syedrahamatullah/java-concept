package syed;
import java.util.ArrayList;

public class Arraylistconcept {

	public static void main(String[] args) {
ArrayList ar = new ArrayList();
     
       ar.add(100);//0
       ar.add(200);//1
       ar.add(300);//2
       System.out.println(ar.size());
       
       
       ar.add(400);//3
       ar.add(500);//4
       
       System.out.println(ar.size());
       
       ar.add("syed");//5
       ar.add('c');//6
       ar.add(28.32);//7
       
       System.out.println(ar.size());
       
       System.out.println(ar.get(6));
       System.out.println(ar.get(7));
       
  //to print all values of arraylist we have to use forloop
       
       for (int i=0; i<ar.size(); i++) {
       System.out.println(ar.get(i));
	
       }
       
  //if we want to write only integer values
      
       ArrayList<Integer> ar1= new ArrayList<Integer>();
       ar1.add(199);
       ar1.add(436);
      // ar1.add('c'); it only ´takes integer values
       
       // if we want to remove ArrayList then
       
       ar.remove(3);
       System.out.println(ar.size());
       
       
       
	
	
	}

}
