package codility;

import java.util.Arrays;
 
public class Leader {

	public static int solution(int[] A)
	{
		int cnt=0;
		int count_index=0;
		int leader=-1;
		for(int i=0;i<A.length;i++)
		{
			// if count is 0 then take current candidate 
			if(cnt==0)
				leader=A[i];
			if(A[i]==leader)
				cnt++;
			else
			{
				cnt--;
			}
		}
		cnt=0;
		// check if more than half of the elements of A are leader-values
		for(int i=0;i<A.length;i++)
			if(A[i]==leader)
				cnt++;
		// if leader-values are less than half of the size of A then return 0
		if(!(cnt>(int)(A.length/2)))
			return 0;
		
		int equi_leaders=0;
		// number of the left sequence side is 0 as no elements are contained at index 0
		int cntLeft=0;
		// number of the right sequence side is the number of number of leader-values 
		int cntRight=cnt;
		for(int i=0;i<A.length;i++)
		{
			//if current element in A is a leader-value, then increment count of the 
			//left sequence and reduce of right sequence
			if(A[i]==leader)
			{
				cntLeft++;
				cntRight--;
			}
			
			// if left and right sequence have more leader-values than the number of 
			// half of the respective sequence size then it is a equi-leader and we increment the count 
			if(cntLeft>(i+1)/2 && cntRight>(A.length-(i+1))/2)
				equi_leaders++;
				
		}
		
		return equi_leaders;
	}
	
	public static void main(String[] args) {
	
		int[] A=new int[] {4,3,4,4,4,2};
		int cnt=solution(A);
		System.out.println("equi-leaders="+cnt);
	}

}
