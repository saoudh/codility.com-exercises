package codility;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class FloodDepth {

	public static int solution(int[] A) {
		
		Deque<Integer> stack=new ArrayDeque<Integer>();
		int low=0;
		int high=A.length-1;
		int localDepth=10;
		while(low<=high)
		{
			if(A[low+1]>A[low])
				low++;
			else
			{
				localDepth=A[low+1];
				low++;
			}
			 if(A[high-1]>A[high])
				high--;
			 else
			 {
				 localDepth=A[high-1];
				 high--;
			 }
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] A=new int[] {1,3,2,1,2,1,5,3,3,4,2};
		int depth = solution(A);
		System.out.println("max depth=" + depth);

	}

}
