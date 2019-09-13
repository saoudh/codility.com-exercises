package codility;

import java.util.Arrays;
import java.lang.Math;
public class MaxNonOverlappingSegments {

	public static int solution(int[] A,int K) {
		// initialize single robe length
		int robeLength=0;
		int countRobes=0;
		for(int i=0;i<A.length;i++)
		{
			robeLength+=A[i];
			if(robeLength>=K)
			{
			//reset robeLength to 0
				robeLength=0;
				// increment number of robes
			countRobes++;
			}
		}
		
		return countRobes;
	}

	public static void main(String[] args) {
		int[] A = new int[] { 1,2,3,4,1,1,3 };
		int K=4;
		int cnt = solution(A,K);
		System.out.println("number of robes=" + cnt);
	}

}
