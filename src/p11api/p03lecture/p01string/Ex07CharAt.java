package p11api.p03lecture.p01string;

public class Ex07CharAt {

	public static void main(String[] args) {
		
		String s1 = "java";
		System.out.println(s1.charAt(0));
		
		char c = s1.charAt(1);
		
		System.out.println(c);
		
		//index범위를 넘어가면 익셉션이 발생한다.
		char d = s1.charAt(4);
		
		System.out.println(d);
	}
}
