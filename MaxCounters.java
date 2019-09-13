package codility;

import java.util.Arrays;

public class MaxCounters {

	public static String solution(int [] A)
	{
		//create copy of A to sort the values and get max value of A
	    int[]B=Arrays.copyOf(A, A.length);
	    
	    Arrays.sort(B);
	    //get max value
		int max=B[B.length-1];
		// number of counters is (max value -1)
		int[] counters=new int[max-1];
		int maxCounterValue=0;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]==max)
			{
				for(int j=0;j<counters.length;j++)
				{
					
					counters[j]=maxCounterValue;
				}
			}
			else
			{
				counters[A[i]-1]++;
				// set maximal counter value if current counter has higher value than so far
				maxCounterValue=maxCounterValue>counters[A[i]-1]?maxCounterValue:counters[A[i]-1];
			}
		}
		
		return Arrays.toString(counters);
	}
	
	public static void main(String[] args) {
	
	    	    int[] A=new int[] {3,4,4,6,1,4,4};
	    	    String cnt=solution(A);
	    	    System.out.println(cnt);
	}

}
