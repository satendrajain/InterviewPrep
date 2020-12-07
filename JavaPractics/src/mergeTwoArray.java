
public class mergeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 6, 13, 15, 33 };
		int b[] = { 1, 7, 16, 32 };

		int length = a.length + b.length;

		int c[] = new int[length];

		
		int i = 0, j = 0, k = 0;
		System.out.println("Length of new array - >" + length);
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[k++] = a[i++];
			} else {
				c[k++] = b[j++];
			}

		}

		while (i < a.length) {
			c[k++] = a[i++];
		}

		while (j < b.length) {
			c[k++] = b[j++];
		}

		for (int m = 0; m < length; m++) {
			System.out.println(c[m] + ",");
		}

	}

}
