package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex03Charaters {

	public static void main(String[] args) {
		String p1 = "[abc]"; //여러개의 패턴을 사용하고 싶을 때는 대괄호를 사용하면 된다.
		System.out.println(Pattern.matches(p1, "a"));//true
		System.out.println(Pattern.matches(p1, "b"));//true
		System.out.println(Pattern.matches(p1, "c"));//true

		System.out.println(Pattern.matches(p1, "d"));//false
		System.out.println(Pattern.matches(p1, "e"));//false
		System.out.println(Pattern.matches(p1, "f"));//false
		
		System.out.println("====================");
		
		String p2 = "[azAZ]";
		System.out.println(Pattern.matches(p2, "A"));//true
		System.out.println(Pattern.matches(p2, "a"));//true
		System.out.println(Pattern.matches(p2, "z"));//true
		System.out.println(Pattern.matches(p2, "Z"));//true
		
		System.out.println(Pattern.matches(p2, "b"));//false
		System.out.println(Pattern.matches(p2, "B"));//false
		
		System.out.println("=======================");
		String p3 = "[abcdefghijklmnopqrstuvwxyz]";
		System.out.println(Pattern.matches(p3, "a"));//true
		System.out.println(Pattern.matches(p3, "b"));//true
		System.out.println(Pattern.matches(p3, "c"));//true
		
		System.out.println(Pattern.matches(p3, "A"));//false
		System.out.println(Pattern.matches(p3, "B"));//false
		System.out.println(Pattern.matches(p3, "C"));//false
	}
}
