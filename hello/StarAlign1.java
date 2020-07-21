package hello;
import java.util.*;
public class StarAlign1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in = new Scanner (System.in);
    System.out.print("Enter loop count");
    int var = in.nextInt();
    String star = "*";
    int num = 1;
		while(var>=num) {
			System.out.println(star);
		    num++;
			star = star+"*";
		}
	}
}
