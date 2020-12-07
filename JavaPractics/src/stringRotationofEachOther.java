
public class stringRotationofEachOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "ABC";
		String str2 = "CBA";
		boolean isEqual = false;
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		
		if(str1.length() != str2.length()) {
			System.out.println("String not rotation of each Other");
		}
		else {
			int length = str1.length();
			int newL = length -1 ;
			
			for(int i = 0 ; i < length;i++) {
				System.out.println("character1 - >" + ch1[i]);
				System.out.println("character2 - >" + ch2[newL -i]);
				if(ch1[i] == ch2[newL -i]) {
					isEqual = true;
					
				}
				else {
					isEqual = false;
					break;
				}
			}
			
		}
		if(isEqual) {
			System.out.println("Both String is Rotaion of other");
		}else {
			System.out.println("No Rotation");
		}

	}

}
