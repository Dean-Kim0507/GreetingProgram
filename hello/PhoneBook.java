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
import java.util.ArrayList;
public class PhoneBook {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> phoneBook = new ArrayList<>();
		
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
			         phoneBook.add(newPerson);break;
			
			case 2 : System.out.println("Enter remove person");
			         String rmPerson = in.next();
			         int k = phoneBook.indexOf(rmPerson);
			         if (k>=0) {
			         	 phoneBook.remove(k);
			         	 System.out.println("Delete Success");break;
			         }
			         else {
			        	 System.out.println("Can not find it");break;
			         }
			
			case 3 : System.out.println("Enter search person");
			         String srPerson = in.next();
			         int j = phoneBook.indexOf(srPerson);
			         if (j>=0) {
			        	 System.out.println(srPerson + " is array at " + j);break;
			         }
			         else {
			        	 System.out.println("Can not find it");break;
			         }
			case 4 : System.out.println("Print All Person");
			         System.out.println(phoneBook);break;
			         
			        
			         
		}
		

	}

	}
}
