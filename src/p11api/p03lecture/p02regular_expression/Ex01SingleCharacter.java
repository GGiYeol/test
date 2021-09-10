package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex01SingleCharacter {

	public static void main(String[] args) {
		String s1 = "a";
		String p1 = "a"; //pattern - 페턴에 맞는지 검사할 string	
		
		boolean b1 = Pattern.matches(p1, s1);//첫번째 파라미터에 패턴, 두번째는 인풋(boolean)
		
		System.out.println(b1);
		
		System.out.println(Pattern.matches(p1, "b")); //페턴이 일치하지 않기 때문에 false
		System.out.println(Pattern.matches(p1, "aa")); //페턴이 완전히 일치해야 true가 나온다.
		System.out.println(Pattern.matches(p1, "A")); //옵션을 주면 true가 나올 수 있다.
		
		System.out.println("======================");
		
		String p2 = "b";
		System.out.println(Pattern.matches(p2, "a"));//false
		System.out.println(Pattern.matches(p2, "b"));//true
		System.out.println(Pattern.matches(p2, "bb"));//false
		
		
	}
}
