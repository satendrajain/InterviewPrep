import java.util.Set;
import java.util.HashSet;

public class intersectionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] inputArray1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		  
        String[] inputArray2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
        
        Set<String> insArray = new HashSet<String>();
        Set<String> newArray =new HashSet<String>();
        for(String str : inputArray1) {
        	insArray.add(str);
        }
        
        for(int i = 0 ; i < inputArray2.length ; i++) {
        	if(!insArray.add(inputArray2[i])) {
        		newArray.add(inputArray2[i]);
        	}
        }
        
       System.out.println(newArray);

	}

}
