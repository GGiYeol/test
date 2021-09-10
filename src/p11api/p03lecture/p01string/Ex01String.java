package p11api.p03lecture.p01string;

public class Ex01String {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = new String("java");
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1 == s2); //참조값으로 비교해서
		System.out.println(s1.equals(s2));
		System.out.println(s1.contentEquals(s2));
	}
}
