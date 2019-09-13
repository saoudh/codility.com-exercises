package codility;

import java.util.ArrayList;

public class NumberSolitaire {

	static void decToBinary(int n) {

		int[] binaryNum = new int[1000];

		// counter for binary array
		int i = 0;
		while (n > 0) {
			// storing remainder in binary array
			binaryNum[i] = n % 2;
			n = n / 2;
			i++;
		}
		ArrayList<Integer> al = new ArrayList<Integer>();

		// printing binary array in reverse order
		for (int j = i - 1; j >= 0; j--) {
			if (binaryNum[j] == 0) {
				int ctr = 0;
				while (binaryNum[j] == 0) {
					ctr++;
					j--;
				}
				al.add(ctr);
			}
		}

		for (int ii = 0; ii < al.size(); ii++) {
			System.out.println(al.get(ii));
		}
	}

	// driver program
	public static void main(String[] args) {
		int n = 1041;
		decToBinary(n);
	}
}
