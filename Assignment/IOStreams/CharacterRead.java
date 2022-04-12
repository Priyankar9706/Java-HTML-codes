import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharacterRead {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter the file name");
		String fileName = sc.nextLine(); 
		
		File file = new File("C:\\Users\\pinku\\Desktop\\"+fileName);
		BufferedReader br;
		char[] charSet = {};
        
		try {
			br = new BufferedReader(new FileReader(file));
	        String content;
	        while ((content = br.readLine()) != null) {
	        	charSet = content.toCharArray();
	        }
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Enter the counted to be counted");
		char charToBeFound = sc.next().charAt(0); 
		int index = 0;
		int count = 0;
		while(index<charSet.length) {
			if(charSet[index]==charToBeFound){
				count++;
			}
			index++;
		}
		System.out.println("File 'Input.txt' has "+count+" instances of "+charToBeFound);
		      
	}

}
