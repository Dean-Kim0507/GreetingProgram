package hello;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;


public class FileIOstream {
public static void main (String[] args) {
	File rfile, wfile;
	
	try {
		System.out.println(args[0]);
		System.out.println(args[1]);
		 rfile = new File(args[0]);
		 wfile = new File(args[1]);
		 //FileReader rfile = new FileReader
		 BufferedReader bufReader =new BufferedReader(new FileReader(rfile));
		 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(wfile));
		 
		 String line ="";
		 while((line = bufReader.readLine()) !=null) {
			 bufferedWriter.write(line);
			 bufferedWriter.newLine();
		 }
		 
		 bufReader.close();
		 bufferedWriter.close();
	 }catch (FileNotFoundException e) {
		 rfile = new File("C:\\Users\\834043\\Desktop\\SAIT\\Test\\abc.txt");
	 }catch(IOException e) {
		System.out.println(e);
	}
 }
}
