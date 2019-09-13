package codility;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Nesting {

	public static boolean solution(String S) {
		Queue<Character> queue = new LinkedList<Character>();
		for (int i = 0; i < S.length(); i++) {
			System.out.println(queue.toString());
			if (S.charAt(i) == '(')
				queue.add(S.charAt(i));
			else {
				queue.poll();
			}
		}

		return queue.isEmpty();
	}

	public static void main(String[] args) {
		String S1 = "(()(())())";
		String S2 = "(()";
		boolean isNested = solution(S1);
		System.out.println(isNested);
	}

}
