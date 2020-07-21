	package hello;
	import java.util.*;
	import java.io.File;
	import java.io.FileNotFoundException;



	public class FileIO2 {
	public static void main (String[] args) {
		File file;
		
		try {
			 file = new File("C:\\Users\\834043\\Desktop\\SAIT\\Test\\abc.txt");
             Scanner scan = new Scanner(file);

			 while((scan.hasNextLine())) {
				 System.out.println(scan.nextLine());
			 }			 
			 scan.close();
		 }catch (FileNotFoundException e) {
			 file = new File("C:\\Users\\834043\\Desktop\\SAIT\\Test\\abc2.txt");
		 }
		}
	 }



