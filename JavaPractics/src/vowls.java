

public class vowls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "this is indepedence day";
		// OP = Thms is mnd

		char[] mychar = str.toCharArray();
		int counter = 0;

		for (int j = 0; j < mychar.length; j++) {
			if (mychar[j] == 'a' || mychar[j] == 'e' || mychar[j] == 'i' || mychar[j] == 'o' || mychar[j] == 'u') {
				counter++;
				
				if (counter % 2 != 0) {
					mychar[j] = 'm';

				}

			}

		}

		for (int i = 0; i < mychar.length; i++) {
			System.out.print(mychar[i]);
		}

	}

}
