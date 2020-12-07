import java.util.Stack;

public class validParenthess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 String str = "(}]{]";
	char[] stra = str.toCharArray();
	 
	 Stack<Character> st = new Stack<Character>();
	 
	 for(int i = 0 ; i < stra.length ; i++) {
		 System.out.println("Charactor ->" +stra[i]);
		 if(stra[i] == '(' || stra[i] == '{' || stra[i] == '[') {
			 	 st.push(stra[i]);
					}
		 
		
		 else{
			 
			 if(st.isEmpty()) {
			 System.out.println("Nothing to pop");
		 }
			 char top = st.peek();
			 System.out.println("Character on Peek - >"+ top);
	
		 if(top == '(' && stra[i] == ')' || top == '{' && stra[i] == '}' || top =='[' && stra[i] == ']') {
			 st.pop();
			
		 }
	 }
	 }
	 if(st.size() == 0) {
		 System.out.println("Valid String");
	 }else {
		 System.out.println("InValid String");
	 }

	}

}
