package codility;

import java.util.Arrays;
import java.lang.Math;
public class MinAbsSum {

	public static int solution(int[] A) {
		
		// sort array as addition is commutative
		Arrays.sort(A);
		//check if all numbers positive
		if(A[0]>0)
			return A[0]+A[0];
		else if(A[A.length-1]<0)
			return -A[A.length-1]-A[A.length-1];
		// initialize min Abs sum with max Abs Sum 
		int minAbsSum=A[A.length-1]+A[A.length-1]>-A[0]-A[0]?A[A.length-1]+A[A.length-1]:A[0]+A[0];
		
		int low=0;
		int high=A.length-1;
		while(low<=high)
		{
			int tmp=A[low]+A[high];
			// get min Abs Sum value of current Abs sum and min Abs sum so far
			minAbsSum=Math.min(Math.abs(A[low]+A[high]),minAbsSum);
			
			if(tmp<=0)
				low++;
			else
			{
				high--;
			}
		}
		
		return minAbsSum;
	}

	public static void main(String[] args) {
		int[] A = new int[] { 4, -2, 2, 5, 1, 5, 8 };
		int cnt = solution(A);
		System.out.println("min Abs sum=" + cnt);
	}

}
