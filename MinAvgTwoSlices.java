package codility;

import java.util.Arrays;

public class MinAvgTwoSlices {

	public static int solution(float[] A) {
		// compute first mininmum Average of the first two-elements slice
		float minAvg = (A[0] + A[1]) / 2;
		// track start index of slice
		int sliceIndex = 0;
		// try only 2- and 3-elements slices
		for (int i = 0; i < A.length - 1; i++) {

			if ((A[i] + A[i + 1]) / 2 < minAvg) {
				minAvg = (A[i] + A[i + 1]) / 2;
				sliceIndex = i;
			}
			if (i < A.length - 2 && (A[i] + A[i + 1] + A[i + 2]) / 3 < minAvg) {

				minAvg = (A[i] + A[i + 1] + A[i + 2]) / 3;
				sliceIndex = i;
			}

		}

		return sliceIndex;
	}

	public static void main(String[] args) {
		float[] A = new float[] { 4, 2, 2, 5, 1, 5, 8 };
		int cnt = solution(A);
		System.out.println("slice index=" + cnt);
	}

}
