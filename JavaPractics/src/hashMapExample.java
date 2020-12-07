import java.util.Arrays;
import java.util.HashMap;

public class hashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "geeksforgeeks";
		String str2 = "forgeeksgeek";
		
		char[] ch = str1.toCharArray();
		

		if (isAnagram(str1, str2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}

	}

	public static boolean isAnagram(String one, String two) {
		boolean isAnagram = false;
		HashMap<Character, Integer> hs1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> hs2 = new HashMap<Character, Integer>();

		char[] arr1 = one.toCharArray();
		char[] arr2 = two.toCharArray();
		// First Array

		for (int i = 0; i < arr1.length; i++) {
			if (hs1.get(arr1[i]) == null) {
				hs1.put(arr1[i], 1);
			} else {
				Integer c =  hs1.get(arr1[i]);
				System.out.println("Value of C "+ c);
				hs1.put(arr1[i], ++c);
			}

		}

		for (int j = 0; j < arr2.length; j++) {
			if (hs2.get(arr2[j]) == null) {
				hs2.put(arr2[j], 1);
			} else {
				Integer d = (int) hs2.get(arr2[j]);
				hs2.put(arr2[j], ++d);
			}

		}
		
		if(hs1.equals(hs2)) {
			isAnagram = true;
		}else {
			isAnagram = false;
		}
		return isAnagram;
	}

}
