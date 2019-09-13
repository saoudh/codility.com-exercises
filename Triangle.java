package codility;
import java.util.Arrays;

public class Triangle {

	public static boolean solution(int[] A)
	{
		Arrays.sort(A);
		
		// first sort the array to make process optimized
		for(int i=0;i<A.length-2;i++)
		{
			if(A[i]+A[i+1]>A[i+2]&&A[i]>0&&A[i+1]>0&&A[i+2]>0)
				return true;
		}
		return false;
		
	}
	
	public static void main(String[] args) {

		int[] A=new int[] {10,2,5,1,8,20};
		boolean isTriangle=solution(A);
		System.out.println("triangle="+isTriangle);
	}

}
