package codility;

import java.util.Arrays;
import java.lang.Math;
public class TieRobes {

	public static int solution(int[] A,int [] B) {
		if(A.length!=B.length||A.length==0||B.length==0)
			return 0;
		int countSegments=1;
		int indexForB=0;
		for(int i=1;i<A.length;i++)
		{
			
			if(B[indexForB]<A[i])
			{
				countSegments++;
				indexForB=i;
			}
			
		}
		
		return countSegments;
	}

	public static void main(String[] args) {
	
				    
		int[] A = new int[] { 1,3,7,9,9 };
			int[] B = new int[] { 5,6,8,9,10 };

		int cnt = solution(A,B);
		System.out.println("number of segments=" + cnt);
	}

}
