package hello;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;


public class FileIO {
public static void main (String[] args) {
	File file;
	
	try {
		 file = new File("C:\\Users\\834043\\Desktop\\SAIT\\Test\\abc.txt");
		 FileReader filereader = new FileReader(file);
		 BufferedReader bufReader =new BufferedReader(filereader);
		 String line ="";
		 while((line = bufReader.readLine()) !=null) {
			 System.out.println(line);
		 }
		 
		 bufReader.close();
	 }catch (FileNotFoundException e) {
		 file = new File("C:\\Users\\834043\\Desktop\\SAIT\\Test\\abc2.txt");
	 }catch(IOException e) {
		System.out.println(e);
	}
 }
}


