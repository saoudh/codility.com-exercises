package codility;

import java.util.ArrayDeque;
import java.util.Deque;

public class StoneWall {

	public static int solution(int[] H) {
		Deque<Integer> stack = new ArrayDeque<Integer>();
		// counter of stones
		int cnt = 0;
		for (int i = 0; i < H.length; i++) {

			while (!stack.isEmpty() && stack.peek() > H[i]) {
				stack.pop();
			}

			if (stack.isEmpty()) {
				stack.push(H[i]);
				cnt++;
				continue;
			} else if (H[i] > stack.peek()) {
				stack.push(H[i]);
				cnt++;
			}

		}

		return cnt;

	}

	public static void main(String[] args) {
		int[] H = new int[] { 8, 8, 5, 7, 9, 8, 7, 4, 8 };
		int cnt = solution(H);
		System.out.println("count=" + cnt);
		// TODO Auto-generated method stub

	}

}
