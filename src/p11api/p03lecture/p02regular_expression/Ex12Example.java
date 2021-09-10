package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex12Example {

	public static void main(String[] args) {
		//전화번호 검증 010-####-####
		String p1 = "010-\\d{4}-\\d{4}";
		System.out.println(Pattern.matches(p1, "010-3131-3131"));
		
		//이전 전화번호까지
		String p2 = "01\\d-\\d{3,4}-\\d{4}";
		System.out.println(Pattern.matches(p2, "011-204-8832"));
		
		String p3 = "01\\d-{0,1}\\d{3,4}-{0,1}\\d{4}";
		System.out.println(Pattern.matches(p3, "01031938932"));
		System.out.println(Pattern.matches(p3, "0123198932"));
		System.out.println(Pattern.matches(p3, "011-3193-8932"));
	}
}
