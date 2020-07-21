package hello;

import java.util.Scanner;

public class MethodTest {

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
			            leftStar(var, star, num);
	                else if (type == 2)
			            rightStar(var, star, space, var1);
	                else
			            middleStar(var, star, space, var1);
	    
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

	public static void middleStar(int var, String star, String space, int var1) {
		for(int num = 1; num<=var; num++) {
			for(int num1 = 1; num1<var1; num1++)
				space += " ";			
			System.out.println(space+star);
			star += "**" ;
			space = "";
		    var1--; 
		}
	}

	public static void rightStar(int var, String star, String space, int var1) {
		for(int num = 1; num<=var; num++) {
			for(int num1 = 1; num1<var1; num1++)
				space += " ";			
			System.out.println(space+star);
			star += "*" ;
			space = "";
		    var1--;
	}
}
	public static void leftStar(int var, String star, int num) {
		while(var>=num) {
			System.out.println(star);
		    num++;
			star = star+"*";
		}
	}
}

