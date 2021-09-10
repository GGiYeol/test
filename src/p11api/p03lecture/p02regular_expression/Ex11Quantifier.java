package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex11Quantifier {

	public static void main(String[] args) {
		String p1 = "a{0,1}";
		String p2 = "a?"; //?는 0또는 1개
		
		System.out.println(Pattern.matches(p1, ""));
		System.out.println(Pattern.matches(p1, "a"));
		
		System.out.println(Pattern.matches(p2, ""));
		System.out.println(Pattern.matches(p2, "a"));
		
		System.out.println("=======================");
		
		//주민등록번호
		String p3 = "\\d{6}-?\\d{7}";
		
		System.out.println(Pattern.matches(p3, "111111-1111111"));
		System.out.println(Pattern.matches(p3, "1111111111111"));
		
		
		
	}
}
