package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex08Series {

	public static void main(String[] args) {
		String p1 = "java";
		
		System.out.println(Pattern.matches(p1, "java"));
		
		String p2 = "a[0-9]"; //총 두글자. 첫글자는 a여야하고 두번째 글자는 0-9여야한다.
		System.out.println(Pattern.matches(p2, "a0"));
		System.out.println(Pattern.matches(p2, "a9"));
		System.out.println(Pattern.matches(p2, "a"));
		System.out.println(Pattern.matches(p2, "a90"));
		System.out.println("========================");
		
		String p3 = "[a-zA-Z]\\w\\w"; //총 세글자.
		System.out.println(Pattern.matches(p3, "a90"));
		System.out.println(Pattern.matches(p3, "090"));
	}
}
