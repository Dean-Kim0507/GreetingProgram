package hello;
import java.util.*;
public class StarAlign3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in = new Scanner (System.in);
    System.out.print("Enter loop count");
    int var = in.nextInt();
    String star = "*";
    String space = "";
    int var1 = var;
    
		for(int num = 1; num<=var; num++) {
			for(int num1 = 1; num1<var1; num1++)
				space += " ";			
			System.out.println(space+star);
			star += "**" ;
			space = "";
		    var1--; 
		}
	}
}
