package codility;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.lang.Math;

public class TapeEquilibrium {

	public static int solution(int[] A) {

		int low = 0;
		int high = A.length - 1;
		int sumLeft = 0;
		int sumRight = 0;
		int i = 0;
		int minDiff = 10;
		while (low <= high) {
			if (sumLeft < sumRight) {
				sumLeft += A[low];
				low++;
			} else if (sumLeft > sumRight) {
				sumRight += A[high];
				high--;
			} else if (sumLeft == sumRight) {
				sumLeft += A[low];
				sumRight += A[high];
				low++;
				high--;
			}
		}
		minDiff = Math.max(sumRight, sumLeft) - Math.min(sumRight, sumLeft);

		return minDiff;

	}

	public static void main(String[] args) {

		int[] A = new int[] { 3, 1, 2, 4, 3 };
		int nr = solution(A);
		System.out.println(nr);
	}

}
