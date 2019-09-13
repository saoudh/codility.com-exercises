package codility;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.ArrayList;
import java.util.Arrays;

public class LongPassword {

	public static int solution(String S) {

		// requirements: odd number of numbers, even number of letters
		// that means: at least 1 number must be contained in the string, as 0 is even number
		Pattern pattern = Pattern.compile("\\b(([a-zA-Z]){2})*\\d(([a-zA-Z]*\\d){2})*\\b");
	
		Matcher matcher = pattern.matcher(S);
		// default value if no valid password found in string is -1
		int maxLength = -1;
		
		// iterate over all valid passwords to get max length 
		while (matcher.find()) {
			String password = matcher.group();
			maxLength = password.length() > maxLength ? password.length() : maxLength;
		}
		return maxLength;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S = "test 5 a0A pass007 pa00se007 ?xy1";

		int length = solution(S);
		System.out.println("max length of valid password=" + length);

	}

}
