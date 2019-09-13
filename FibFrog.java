package codility;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class FibFrog {

	public static int solution(int[] A)
	{
		
		int MAX_N_VALUE = 100000;

		    int N = A.length;

		    // If only 1 or 2 leaves,
		    // can jump that in 1 jump
		    if (N < 3) {
		        return 1;
		    }
		    
		    // Generate fibonacci numbers
		    int[] fibNums=new int[MAX_N_VALUE];
		    fibNums[0]=0;
		    fibNums[1]=1;
		    
		    for (int i = 2; i < MAX_N_VALUE;i++) {
		        fibNums[i]=(fibNums[i-1] + fibNums[i-2]);   
		    }
		    
		    // Reachable leaves vector
		    int[] reachable=new int[N];
		    for (int i = 0; i < N; ++i) {
		        reachable[i] = 0;
		    }

		    int pos;
		    
		    // Queue of leaves positions to analyze, starting at -1
		    Queue<Integer> leavesToLookAt=new LinkedList<Integer>();
		    leavesToLookAt.add(-1);
		    
		    // Get reachable leaves only from first jump
		    for (int i = 2; i < fibNums.length; ++i) {
		        pos = fibNums[i] - 1;
		        
		        if (pos > N) {
		            break;
		        } else if (pos == N) {
		            return 1;
		        } else if (A[pos]==1) {
		             reachable[pos] = 1;
		             leavesToLookAt.add(pos);
		        }
		    }

		    
		    // Look at humps from other leaves we have reached
		    int nextPos;
		    int minJumps = -1;
		    //loop over all possible leaves 
		    while(leavesToLookAt.peek()!=null) {
		        pos = leavesToLookAt.poll();
		        for (int i = 2; i < fibNums.length; ++i) {
		            nextPos = pos + fibNums[i];
		            // if current fibonacci number exceeded the target, then leave loop and try next starting position pos
		            if (nextPos > N) {
		                // can't jump more than N + 1 (destination)
		                break;
		            } 
		            // if target position at nextPos reached and jumps from current position pos are lower than th 
		            else if (nextPos == N) {
		                // Destination
		                if ((minJumps == -1) || ((reachable[pos] + 1) < minJumps)) {
		                    // Update minJumps if found a path that is cheaper
		                    minJumps = reachable[pos] + 1;

		                }
		            } 
		            // if target not reached with current fibonacci-number (=pos+fibNums(i)) but it is a leave, then increment jump-count 
		            // at that pos 
		            else if (A[nextPos]==1 && reachable[nextPos]==0) {
		                reachable[nextPos] = reachable[pos] + 1;
		                // add next pos as a relevant leaf which will looped over at next iteration
		                leavesToLookAt.add(nextPos);

		            }
		        }
		    }

		    return minJumps;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A=new int[] {0,0,0,1,1,0,1,0,0,1,0};
		
		int minJumps=solution(A);
		System.out.println("min Jumps="+minJumps);

	}

}
