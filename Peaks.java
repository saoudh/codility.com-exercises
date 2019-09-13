package codility;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Peaks {

	public static int solution(int[] A)
	{
		int cnt=0;
		List<Integer> myPeaks=new ArrayList<Integer>();
		for(int i=1;i<A.length-1;i++)
		{
			if(A[i]>A[i-1] && A[i]>A[i+1])
			{
				//add index of peak to list
			myPeaks.add(i);	
			}
		}
		int peakLow=0;
		int peakHigh=myPeaks.size();
		while(peakLow<peakHigh)
		{
			int peakMid=(int)((peakLow+peakHigh)/2);

			int blockLength=A.length/peakMid;
			List<Boolean> works=new ArrayList<Boolean>();
			if(A.length%peakMid==0)
			{
				for(int i=0;i<peakMid;i++)
				{
					for(int j=0;j<myPeaks.size();j++)
					{
						if(myPeaks.get(j*blockLength)>i&&myPeaks.get(j)<(i+1)*blockLength)
						{
							works.add(true);
							break;
						}
					}
				}
			}
			else
			{
			peakLow++;	
			continue;
			}
			//System.exit(0);
			//if it worked well, then try with more blocks
			if(works.size()==peakMid)
			{
				peakLow=peakMid+1;
				cnt=peakMid;

			}
			//if it worked bad and not all blocks have peaks, then reduce the high-value to try with less blocks
			else if(works.size()<peakMid)
			{

				peakHigh=peakMid-1;
			}
			
		}

		
		
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A=new int[] {2,3,4,3,4,1,2,3,4,6,2,4,6,2,6,2};
		System.out.println("A="+Arrays.toString(A)+"-length="+A.length);

		System.out.println(solution(A));
	}

}
