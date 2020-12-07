import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AQR {

	public static void main(String[] args) {

		int[] arr = { 3, 4, -2, 1, 2 };
		int k = 2;

		AQR a = new AQR();
		System.out.println(a.arrayTrip(arr, k));
	}

	long arrayTrip(int[] arr, int k) {

		
		long maxScore = 0;
		
		for (int i = 0; i < arr.length; i++) {

			
			int t1[] = Arrays.copyOfRange(arr, i+1, i+1+k);
			maxSubArray(t1);
			
			//maxScore += (arr[i] + temp);

		}

		return maxScore;
	}

	long maxSubArray(int[] arr) {

		long maxScore = Integer.MIN_VALUE;
		long count = 0;
		for (int i = 0; i < arr.length; i++) {

			count = count + arr[i];

			if (count > maxScore) {
				maxScore = count;
			}

			if (count < 0) {
				count = 0;
			}

		}

		return maxScore;
	}

}
