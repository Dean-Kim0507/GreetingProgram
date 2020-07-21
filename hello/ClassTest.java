package hello;
import java.util.*;


public class ClassTest {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String star = "*";
	    int num = 1;
	    String space = "";

	    
		for(; ; ) {
	        System.out.print("1.Left\n2.Right\n3.Centre");
	        System.out.print("Choose alignment type: ");
	        int type = in.nextInt();
	            if(type<=3) {
	                System.out.print("Enter the line number: ");
	                int var = in.nextInt();
	        	    int var1 = var;
	        	    
	                if (type==1)
			            MethodTest.leftStar(var, star, num);
	                else if (type == 2)
	                	MethodTest.rightStar(var, star, space, var1);
	                else
	                	MethodTest.middleStar(var, star, space, var1);
	    
	                System.out.print("Continue(y/n)");
	                String cont = in.next();
	                if(cont.contentEquals("y"))
	    	            continue;
	                else break;
	            }
	            else 
	            	System.out.println("Incorrect Number");
		}
	}
}

