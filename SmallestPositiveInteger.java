package codility;

import java.util.Arrays;

public class SmallestPositiveInteger {

	public int solution(int[] A) {
		// write your code in Java SE 8

		Arrays.sort(A);
		int low = 0;
		int high = A.length - 1;
		int mid = 0;
		if (A[A.length - 1] < 1)
			return 1;
		// if only positive values and smallest value is higher than 1, otherwise find the value 1 in the array 
		if (A[0] > 1)
			return 1;
		else {
			while (low <= high) {
				mid = (int) (low + high) / 2;
				System.out.println("mid=" + mid);
				if (A[mid] < 1) {
					low = mid + 1;
				}
				if (A[mid] > 1) {
					high = mid - 1;
				}
				if (A[mid] == 1)
					break;
			}
		}
		// if there is no value 1 then return 1
		if(A[mid]!=1)
			return 1;
		
		for (int i = mid; i < A.length; i++) {
			if (i == 0) {
				if (A[i] != 1) {

					return A[i];
				}
			} else if (A[i - 1] + 1 != A[i] && A[i - 1] != A[i]) {

				return A[i - 1] + 1;
			}

		}

		return A[A.length - 1] + 1;

	}

	public static void main(String[] args) {
		// int[] A=new int[] {1, 3, 6, 4, 1, 2};
		// int[] A=new int[] {1, 2,3};
		int[] A = new int[] { -1,4 };

		int cnt = new SmallestPositiveInteger().solution(A);
		System.out.println("cnt=" + cnt);
	}
}
