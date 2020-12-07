import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class duplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {20,34,56,20,25,56,34};
		
		//First Solution
		System.out.println("Via BruteForce");
		  for(int i = 0 ; i < a.length ; i++) {
			  for(int j = i+1 ; j < a.length ; j++) {
		  if(a[i] == a[j] && i != j) { 
			  System.out.println("Duplicate Value ->"+ a[i]);
		  }
		  
		  } }
		 System.out.println("-------------------------------");
		
		//Second Solution
		
		System.out.println("Via Set");
		  Set<Integer> hs = new HashSet<Integer>();
		  
		  for(int i : a) {
		  
		  if(!hs.add(i)) { System.out.println("Duplicate Value - >"+ i); } }
		 
		  System.out.println("-------------------------------");
		//Third Solution
		  System.out.println("Via Map");
		Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int i : a) {
			
			if(hm.get(i) == null) {
				hm.put(i, 1);
				
			}
			else {
				int c = hm.get(i);
				hm.put(i,++c);
			}
		}
		
		Set<Entry<Integer,Integer>> es = hm.entrySet();
		
		for(Entry<Integer,Integer> e : es) {
			 if(e.getValue() > 1) {
				 System.out.println("Duplicate - >"+ e.getKey());
			 }
		}
		

	}

}
