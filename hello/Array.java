/* 
 * get String 
 * split String by ","
 * parse String -> number
 * array number
 * make calculators(sum,avg) as a class
 * print result
 * 
 * 
 */
package hello;
import java.util.*;

class Cal{
	Cal(){}
	int sum(int[] a_k) {
		int total = 0;
		
		for (int i = 0; i<a_k.length; i++) {
			total += a_k[i];
		} 
		return total;
	}
	   int avg(int[] a_k) {
	    	int total = 0;
	    	
        for (int i = 0; i<a_k.length; i++) {
    			total += a_k[i];
        }
        return total/a_k.length;
    }
}


public class Array {
	public static void main (String[] args) {
	
	
	Scanner in = new Scanner(System.in);
	System.out.print("Enter number");
	String k = in.nextLine();
	String[] j = k.split(",");
	int[] a_k = new int [j.length];
	
	for (int i=0; i<j.length; i++) {
	    a_k [i] = Integer.parseInt(j[i]);
	}
	Cal cal = new Cal();
	System.out.println(cal.sum(a_k));
	System.out.println(cal.avg(a_k));
}
}

