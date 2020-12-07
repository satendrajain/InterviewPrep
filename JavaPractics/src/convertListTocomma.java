import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class convertListTocomma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<String> list = new ArrayList<>( Arrays .asList("Geeks","ForGeeks","GeeksForGeeks")); 
		 String newstr = "";
		 for(int i = 1 ; i < list.size() ; i++) {
			newstr = newstr + list.get(0) + ","+list.get(i); 
		 }
		 
		 System.out.println("newSTr - >"+ newstr);

	}

}
