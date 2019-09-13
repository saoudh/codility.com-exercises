package codility;

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
    	System.out.println("unsorted:"+Arrays.toString(A));

    	Arrays.sort(A);
    	System.out.println("sorted:"+Arrays.toString(A));
    	System.out.println(A[A.length-1]);
    	for(int i=1;i<A[A.length-1];i++)
    	{
    		System.out.println(i+"-"+Arrays.binarySearch(A, i));
    		if(Arrays.binarySearch(A, i)>0)
    		{
    			System.out.println("not contained:"+i);
    		}
    		else
    		{
    			System.out.println("contained:"+i);
    		}
    	}
		return 0;
        // write your code in Java SE 8
        
    }
    public static void main(String[] args)
    {
    	Solution s=new Solution();
    	int[] A= new int[] {3,2,1,6,7,3};
    	s.solution(A);
    }
}