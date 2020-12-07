
public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "XYZ";
		String str2 = "ZYX";
		
		if(str1.length() == str2.length()) {
			System.out.println("Eligible for check");
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			int size = ch1.length ;
			for(int i = 0 ; i < size; i++,size--) {
				if(ch1[i] == ch2[size-1]) {
					System.out.println("proceed further");
					
				}else {
					System.out.println("not matching");
					break;
				}
			}
		}

	}

}
