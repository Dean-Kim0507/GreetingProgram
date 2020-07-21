package hello;

import java.util.ArrayList;
import java.util.Scanner;



class PhoneBook6 {
	void add(ArrayList<String> phoneBook, String nP) {
        phoneBook.add(nP);
	}
	void delete(ArrayList<String> phoneBook, String rP) {			         
		int k = phoneBook.indexOf(rP);
    if (k>=0) {
    	 phoneBook.remove(k);
    	 System.out.println("Delete Success");
    }
    else {
   	 System.out.println("Can not find it");
    }
	
}
	void search(ArrayList<String> phoneBook, String sP) {
		int j = phoneBook.indexOf(sP);
        if (j>=0) {
       	 System.out.println(sP + " is array at " + j);
        }
        else {
       	 System.out.println("Can not find it");
        }
}
    
    	
    }

public class PhoneBook3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> phoneBook = new ArrayList<String>();
		PhoneBook6 pb = new PhoneBook6();
		
		for ( ; ;) {
		System.out.println("1)Add New person");
		System.out.println("2)Remove person");
		System.out.println("3)Search person");
		System.out.println("4)Print all person");
		System.out.println("Enter a number");
		int table = in.nextInt();
		
		
			switch(table) {
			case 1 : System.out.println("Enter new person");
	                 String newPerson = in.next(); 
				     pb.add(phoneBook, newPerson);break;
			
			case 2 : System.out.println("Enter remove person");
			         String rmPerson = in.next();
			         pb.delete(phoneBook, rmPerson);break;
			
			case 3 : System.out.println("Enter search person");
			         String srPerson = in.next();
			         pb.search(phoneBook, srPerson);break;
			         
			case 4 : System.out.println("Print All Person");
			         System.out.println(phoneBook);break;			         
		}
		

	}

	}

}
