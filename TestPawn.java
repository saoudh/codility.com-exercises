package codility;

import java.util.List;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPawn {

	public static int solution(int[] A) {
		int cnt = 0;
		boolean[] visitedElements = new boolean[A.length];
		boolean[] exitingElements = new boolean[A.length];

		// check if it is infinitive loop
		for (int i = 0; i < A.length; i++) {
			int newIndex = i + A[i];

			if (newIndex > A.length - 1 || newIndex < 0)
				exitingElements[i] = true;

		}
		int newIndex = 0;
		while (newIndex >= 0 && newIndex <= A.length - 1) {

			// if we visit the element a second time, then we have an infinite loop
			if (visitedElements[newIndex])
				return -1;
			visitedElements[newIndex] = true;
			newIndex = newIndex + A[newIndex];
			cnt++;

		}

		return cnt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] A=new int[] {2,3,-1,1,3};
		int[] A = new int[] { 1, 1, -1, 1 };

		int cnt = solution(A);
		System.out.println("cnt=" + cnt);

	}

}
