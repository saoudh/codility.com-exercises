package codility;

import java.util.Arrays;

public class RodCutting {
	static int getRecursion(int[] values, int length) {
        if (length <= 0)
            return 0;
        int tmpMax = -1;
        for (int i = 0; i < length; i++) {
            tmpMax = Math.max(tmpMax, values[i] + getRecursion(values, length - i - 1));
        }
        return tmpMax;
    }
	
	    static int getDP(int[] values, int rodLength) {
	        int[] subSolutions = new int[rodLength + 1];
	        for (int i = 1; i <= rodLength; i++) {
	            int tmpMax = -1;
	            for (int j = 0; j < i; j++)
	            {
	    	       
	                tmpMax = Math.max(tmpMax, values[j] + subSolutions[i - j - 1]);
	            }
	            subSolutions[i] = tmpMax;

	        }
	        return subSolutions[rodLength];
	    }

	    public static void main(String[] args) {
	        int[] values = new int[]{3, 7, 1, 3, 9};
	        int rodLength = values.length;

	        System.out.println("With Recursion - Max rod value: " + getRecursion(values, rodLength));
	        System.out.println("With Dynamic Programming - Max rod value: " + getDP(values, rodLength));

	    }
	}

