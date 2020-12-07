

public class leftRotationOFString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Left rotation
		// nrotatio
		
		//String , int
		String str = "abc";
		
		String newstr[] = str.split("");
		
		
		String result = substr(str,0);
		
		System.out.println(result);
		
		//op = otationr
		
		//stringrotation(str ,2);

	}
	
	public static String substr(String str , int no) {
		
		if(no > 0) {
			
			String three =str.substring(str.length() -1,no)+ str.substring(no, str.length()-1) ; 
			
		}
		
		String three = str.substring(no, str.length()-1)+ str.substring(0,no); 
		
		return three ;
		
	}
	
	public static String stringrotation(String str , int no) {
		String output = "";
		char[] ch = str.toCharArray();
		
		
		for(int i = 0 ; i < no ; i++) {
		char temp = ch[0];
		int j = 0;
			for( j= 0 ; j < str.length()-1 ;j++) {
				
				ch[j] = ch[j+1];
			}
			ch[j] = temp;
			
			
			
		}
		for (int k = 0 ; k < ch.length ; k++) {
			System.out.print(ch[k]);
		}
		
		return output;
	}
	
	/**
	 * Use of Function , Use optimal , 
	 * Discuss approch 
	 * keep talking about solution 
	 * Appium Mobile based Automation  - 
	 * talk about corner cases , API testing approch , code breaking 
	 * Handling real life problem
	 * focus on Negative scenrio 
	 * Database 
	 * CICD 
	 * 
	 */

}
