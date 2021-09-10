package p11api.p03lecture.p01string;

public class Ex09Trim {//깎아낸다.
	public static void main(String[] args) {
		String s1 = "   java   "; //쓸데없는 데이타를 없애줌. Ex)공백
		String s2 = s1.trim();
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
