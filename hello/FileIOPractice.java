package hello;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;


public class FileIOPractice {
public static void main (String[] args) {
	File rfile, wfile;
	
	try {
		 rfile = new File("C:\\Users\\834043\\Desktop\\SAIT\\Test\\abc.txt");
		 wfile = new File("C:\\Users\\834043\\Desktop\\SAIT\\Test\\abc2.txt");
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
