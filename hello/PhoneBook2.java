/*
*print table
*get table number
*switch
*1- add new person
*2- remove new person
*3- search- for loop (get)
*4- print all phone book for loop (print-array)
*
*/

package hello;
import java.util.*;

class Pb {
	Pb(){
	}
	
	Scanner in = new Scanner(System.in);
	int i,k,s,r,c,p=1;
		
	void add (String[] phoneBook) {
		System.out.println("Enter new person");
        String newPerson = in.next();
        phoneBook[p-1] = newPerson;
        p++;
	}
        
	
	void delete(String[] phoneBook) {
		System.out.println("Enter remove person");
		String rmPerson = in.next();
        for(i=0; i<phoneBook.length; i++) {
         if (rmPerson.equals(phoneBook[i])) {
       	 for(k=i; k<phoneBook.length; k++) {
       		 if (k<phoneBook.length-1) {
       	        phoneBook[k] =phoneBook[k+1];
       		 }
       		 else { 
       			 phoneBook[phoneBook.length-1]=null;
       		     System.out.println("Delete Success");
       		     p--;
       		 }
       	 }
        }
        else continue;
        } 
}
	void search(String[] phoneBook) {
		System.out.println("Enter search person");
		String srPerson = in.next();
        for (s =0; s<phoneBook.length; s++ ) {
          if (srPerson.equals(phoneBook[s])) {
       	 System.out.println(srPerson + " is array at " + s);break;
        }
          else if (s==phoneBook.length-1) {
       	 System.out.println("Cannot find it");
        }
          else continue;
        }
	}
	void print(String[] phoneBook) {
		System.out.println("Print All Person");
        for (r= 0; r<phoneBook.length; r++) {
          if(phoneBook[r]!=null)
       	 System.out.println(phoneBook[r]);
          else break;
        }
	}

	void extension(String[] phoneBook) {
	    if (p>phoneBook.length*0.9) {
	    	String[] phoneBook2 = new String[phoneBook.length*2];
	    	for (c = 0; c<phoneBook.length; c++)
	    		phoneBook2[c]=phoneBook[c];
	    	phoneBook = phoneBook2;
	}
}
}

public class PhoneBook2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String[] phoneBook = new String[5];
	    Pb pb = new Pb();

		for (; ;) {

		System.out.println("1)Add New person");
		System.out.println("2)Remove person");
		System.out.println("3)Search person");
		System.out.println("4)Print all person");
		System.out.println("Enter a number");
		int table = in.nextInt();
		
		
			switch(table) {
			case 1 : pb.add(phoneBook);break;
			
			case 2 : pb.delete(phoneBook);break;
				
			case 3 : pb.search(phoneBook); break;
			         
			case 4 : pb.print(phoneBook); break;
			        
			         
		}
		
	 pb.extension(phoneBook);
     
    }
    
	}

}

