import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class CopyContent {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter the input file name");
		String srcFileName = sc.nextLine(); 
		
		System.out.println("Enter the output file name");
		String destFileName = sc.nextLine();
		
		File srcFile = new File("C:\\Users\\pinku\\Desktop\\"+srcFileName);		
		File destFile = new File("C:\\Users\\pinku\\Desktop\\"+destFileName);
		
		    try (
		      InputStream in = new BufferedInputStream(new FileInputStream(srcFile));
		      OutputStream out = new BufferedOutputStream(new FileOutputStream(destFile))) {
		    	byte[] buffer = new byte[1024];
		        int lengthRead;
		        while ((lengthRead = in.read(buffer)) > 0) {
		            out.write(buffer, 0, lengthRead);
		            out.flush();
		        }
		    }
		    System.out.println("File is copied");

	}

}
