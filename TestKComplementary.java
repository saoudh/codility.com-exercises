package codility;

import java.util.List;
import java.lang.Math;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Arrays;

public class TestKComplementary {

	public static int solution(int[] A, int K) {

		int cnt = 0;
		Arrays.sort(A);
		System.out.println("Asorted=" + Arrays.toString(A));
		// if K is positive but all elements in A are negative and vice versa then
		// return 0
		if (A[A.length - 1] < 0 && K > 0)
			return 0;
		if (A[0] > 0 && K < 0)
			return 0;
		for (int i = 0; i < A.length; i++) {
			int low = 0;
			int high = A.length - 1;
			boolean[] alreadyUsed = new boolean[A.length];

			while (low <= high) {
				int mid = (int) Math.round((low + high) / 2);
				// if current mid-value is higher than K, then decrement high-limit
				if (A[i] + A[mid] > K)
					high = mid - 1;
				// if current mid-value is lower than K, then increment low-limit
				if (A[i] + A[mid] < K)
					low = mid + 1;
				if (A[i] + A[mid] == K) {
					low++;
					if (!alreadyUsed[mid])
						cnt++;
				}
				alreadyUsed[mid] = true;

			}
		}

		return cnt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int K = 6;

		int[] A = new int[] { 1, 8, -3, 0, 1, 3, -2, 4, 5 };

		int cnt = solution(A, K);
		System.out.println("cnt=" + cnt);

	}

}
