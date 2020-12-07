import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class disariumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 175 ;
		int temp = 0;
		
		Stack<Integer> nolist = new Stack<Integer>();
		
		// 175 = 1*1 + 7*7 + 5*5*5 
		
		while (i > 0) {
			temp = i % 10 ;
			nolist.add(temp);
			i = i /10;
			
		}
		disNo(nolist);
		
	}

public static void disNo(Stack<Integer> st) {
	
	int size = st.size();
	int newNo = 0;
	
	for(int i = 1 ; i < size+1 ; i++) {
	
	newNo = newNo+(int) Math.pow(st.peek(),i);
	System.out.println("NewNO - >"+ newNo);
	st.pop();
	}
	
}
}
