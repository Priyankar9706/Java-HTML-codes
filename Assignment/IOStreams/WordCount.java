import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount {
	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		String srcFileName = args[0];
		String destFileName = args[1];
		File srcFile = new File("C:\\Users\\pinku\\Desktop\\"+srcFileName);				
		BufferedReader br;
		String[] words = {};
        	String str ="";
		try {
			br = new BufferedReader(new FileReader(srcFile));
	        String content;
	        while ((content = br.readLine()) != null) {
	        	str+=content+" ";
	        }
	        words = str.split(" ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		Arrays.sort(words);
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		for(String s:words) {
			if(map.containsKey(s)) {
				map.put(s,map.get(s)+1);
			}else {
				map.put(s, 1);
			}
		}
		
		  BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\pinku\\Desktop\\"+destFileName,true));
		  
		  for(String key:map.keySet())
	            out.write(key + " : "+map.get(key)+"\n");
		  out.close();
	          
	}
}
