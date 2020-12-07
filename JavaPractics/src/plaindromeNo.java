import java.util.List;
import java.util.ArrayList;

public class plaindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 12122;
		int y = 0;
		boolean b = false;
		
		List<Integer> mylist = new ArrayList<Integer>();
		
		while(i >0) {
			y = i%10;
			mylist.add(y);
			i = i/10;
		}

		int len = mylist.size();
		System.out.println("List -> "+ mylist);
		for(int j = 0 ; j < len ; j++) {
			if(mylist.get(j) == mylist.get(len-1)) {
				len --;
				b = true;
				
			}
			else {
				System.out.println("No is not palindrom");
				b = false;
				break;
			}
		}
		
		if(b) {
			System.out.println("No is Plaindrome");
		}
	}

}
