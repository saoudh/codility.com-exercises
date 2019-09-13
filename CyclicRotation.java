package codility;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.lang.Math;

public class CyclicRotation {

	public static int[] solution(int[] A, int K) {
		int[] B = new int[A.length];

		for (int i = 0; i < A.length; i++) {
			B[(i + K) % A.length] = A[i];
		}
		return B;

	}

	public static void main(String[] args) {

		int K = 5;

		int[] A = new int[] { 1, 2, 3, 4 };
		int[] array = solution(A, K);
		System.out.println(Arrays.toString(array));
	}

}
