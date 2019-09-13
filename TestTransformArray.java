package codility;

import java.util.List;
import java.lang.Math;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Arrays;

public class TestTransformArray {

	public static int solution(int[] A) {

		int cnt = 0;
		// if no or 1 element then return 0
		if (A.length < 2)
			return 0;
		Arrays.sort(A);
	
		int minValue = A[0];
		int maxValue = A[A.length - 1];
		int midValue = (int) (maxValue + minValue) / 2;
		for (int i = 0; i < A.length; i++) {
			if (Math.abs(A[i] - midValue) % 2 == 0)
				return -1;

		}

		return maxValue - midValue < midValue - minValue ? maxValue - midValue : midValue - minValue;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = new int[] { 12, 3, 7, 1 };

		int cnt = solution(A);
		System.out.println("cnt=" + cnt);

	}

}
