import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader( new FileReader("C:\\application.log"));
		String s = "";
		String str = "INFO";
		int count = 0;
		while((s = br.readLine()) != null) {
			
			String[] words = s.split(" ");
			
			for(String word:words) {
				if(word.equals(str)) {
					System.out.println("Word - > "+ word);
					count++;
					
				}
				
			}
			
					
		}
		
		System.out.println("count ->"+ count);

	}

}
