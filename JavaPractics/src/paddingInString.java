
public class paddingInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "thisisjava";
		int L = 12;
		char ch = '-';
		
		String result = String.format("%" + (-L) + "s", str).replace(' ', ch); 
		
		System.out.println(result);

	}

}
