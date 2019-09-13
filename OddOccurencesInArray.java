package codility;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class OddOccurencesInArray {

	public static int solution(int[] A)
	{
		
		int low=0;
		int high=A.length-1;
		Arrays.sort(A);
		int i=0;
		while(low<=high)
		{
			
			if(A[low]==A[low+1])
			{
				low=low+2;
			}
			else
			{
				return A[low];
			}
			
			if(A[high]==A[high-1])
			{
				high=high-2;
			}
			else
			{
				return A[high];
			}
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
	
		int[] A=new int[] {9,3,9,3,9,7,9};
	    	    int nr=solution(A);
	    	    System.out.println(nr);
	}

}
