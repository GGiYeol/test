package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex05Character {

	public static void main(String[] args) {
		String p1 = "[^a]"; //^은 그것을 제외하고 다.not이라는 의미가 있다.
		
		System.out.println(Pattern.matches(p1, "a")); //false
		System.out.println(Pattern.matches(p1, "b")); //true
		
		String p2 = "[^a-z]";
		System.out.println(Pattern.matches(p2, "a"));
		System.out.println(Pattern.matches(p2, "B"));
		System.out.println(Pattern.matches(p2, "3"));

		String p3 = "[a-z^c]";
		System.out.println(Pattern.matches(p3, "a"));
		System.out.println(Pattern.matches(p3, "c"));
		System.out.println(Pattern.matches(p3, "^"));

		String p4 = "[^ca-z]";
		System.out.println(Pattern.matches(p4, "a"));
		System.out.println(Pattern.matches(p4, "c"));
		
		String p5 = "[a-bd-z]";
		System.out.println(Pattern.matches(p5, "a"));
		System.out.println(Pattern.matches(p5, "b"));
		System.out.println(Pattern.matches(p5, "c"));
		
		String p6 = "[a-z&&[^c]]";
		System.out.println(Pattern.matches(p6, "a"));
		System.out.println(Pattern.matches(p6, "b"));
		System.out.println(Pattern.matches(p6, "c"));
		
	}
}
