package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SlalomSkiing {

	public static int solution(int[] A)
	{
		int cnt=0;
		List<Integer> A_new=new ArrayList<Integer>();

		// get highest value in the array
		int maxValue=Arrays.stream(A).max().getAsInt()+1;
		// 1. prepare the Array
		for(int i=0;i<A.length;i++)
		{
			//a. add offset + value
			A_new.add(maxValue*2+A[i]);
			//b. add offset - value
			A_new.add(maxValue*2-A[i]);
			//c. add just value
			A_new.add(A[i]);
		}
		int low=0;
		int high=0;
		int mid=0;
		//int[] dp=new int[A_new.size()];
		List<Integer> dp=new ArrayList<Integer>();
		dp.add(-1);
		// 2. Dynamic programming: Search for the longest incremental subsequence
		for(int i=0;i<A_new.size();i++)
		{
			low=0;
			high=dp.size()-1;
			while(low<=high)
			{
				mid=(int)(high+low)/2;
				//System.out.println("A(i)="+A_new.get(i)+"-dp.get(mid)="+dp.get(mid));
				if(A_new.get(i)<dp.get(mid))
				{
					high=mid-1;
				}
				else if(A_new.get(i)>dp.get(mid))
				{
					low=mid+1;
				}
				else if(A_new.get(i)==dp.get(mid))
				{
					break;
				}
			}

			if(low==dp.size())
				dp.add(A_new.get(i));
			else
			{
				dp.set(low,A_new.get(i)<dp.get(low)?A_new.get(i):dp.get(low));
			}
     
		}
		
		
		
		return dp.size();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A=new int[] {15,13,5,7,4,10,12,8,2,11,6,9,3};
		int cnt=solution(A);
		System.out.println("count="+cnt);
	}

}
