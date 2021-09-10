package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex07AnyCharacter {

	public static void main(String[] args) {
		
		String p1 = ".";//한글자 캐릭터는 다 된다.
		
		System.out.println(Pattern.matches(p1, " "));
		System.out.println(Pattern.matches(p1, "a"));
		System.out.println(Pattern.matches(p1, "Z"));
		System.out.println(Pattern.matches(p1, "0"));
		System.out.println(Pattern.matches(p1, "가"));
		System.out.println(Pattern.matches(p1, "家"));
		
		System.out.println("==========================");
		
		String p2 = "\\."; //.만 패턴으로 가지고 싶을 때
		
		System.out.println(Pattern.matches(p2, " "));
		System.out.println(Pattern.matches(p2, "a"));
		System.out.println(Pattern.matches(p2, "Z"));
		System.out.println(Pattern.matches(p2, "0"));
		System.out.println(Pattern.matches(p2, "가"));
		System.out.println(Pattern.matches(p2, "."));
	}
}
