package codility;

import java.util.Arrays;

public class ChocolatesByNumber {

	public static void process(int m, boolean[] n) {

		for (int i = 0;; i++) {
			if (n[i * m % n.length] == true)
				break;

			n[i * m % n.length] = true;
		}
		System.out.println("end:" + Arrays.toString(n));

	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(new boolean[10]));
		process(3, new boolean[8]);

	}

}
