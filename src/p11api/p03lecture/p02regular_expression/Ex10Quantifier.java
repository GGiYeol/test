package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex10Quantifier {

	public static void main(String[] args) {
		String p1 = "a{1,}";//a가 1개 이상
		String p2 = "a+"; //a가 1개 이상
		System.out.println(Pattern.matches(p1, " "));
		System.out.println(Pattern.matches(p1, "a"));
		System.out.println(Pattern.matches(p1, "aa"));
		
		System.out.println(Pattern.matches(p2, " "));
		System.out.println(Pattern.matches(p2, "a"));
		System.out.println(Pattern.matches(p2, "aa"));
		
		System.out.println("========================");
		
		String p3 = "a{0,}";
		String p4 = "a*";
		System.out.println(Pattern.matches(p3, " "));
		System.out.println(Pattern.matches(p3, "a"));
		System.out.println(Pattern.matches(p3, "aaaaaa"));
		
		System.out.println(Pattern.matches(p4, " "));
		System.out.println(Pattern.matches(p4, "a"));
		System.out.println(Pattern.matches(p4, "aa"));
		
		System.out.println(Pattern.matches(p4, "ab")); //a가 반복해서 0개 이상
		
		System.out.println("==========================");
		
		String p5 = "[a-zA-Z]\\d*"; //영문자로 시작해서 숫자가 0개 이상
		System.out.println(Pattern.matches(p5, "c"));
		System.out.println(Pattern.matches(p5, "c1"));
		System.out.println(Pattern.matches(p5, "c1123123123"));
		System.out.println(Pattern.matches(p5, "ca123123123"));
		
		String p6 = "(java)*";
		System.out.println(Pattern.matches(p6, "javajavajavajavajava"));
				
	}
}
