	package hello;

	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.FileNotFoundException;
	import java.io.BufferedWriter;



	public class FileIO3 {
	public static void main (String[] args) {
		File file;
		
		try {
			 file = new File("C:\\Users\\834043\\Desktop\\SAIT\\Test\\abc.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));

			 if(file.isFile() && file.canWrite()) {
				 bufferedWriter.write("------------");
				 bufferedWriter.newLine();
				 bufferedWriter.write("************");
				 bufferedWriter.close();
			 }			 
			 bufferedWriter.close();
		 }catch (IOException e) {
			 file = new File("C:\\Users\\834043\\Desktop\\SAIT\\Test\\abc2.txt");
		 }
		}
	 }


