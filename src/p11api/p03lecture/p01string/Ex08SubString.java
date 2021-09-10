package p11api.p03lecture.p01string;

public class Ex08SubString {
	public static void main(String[] args) {
		String s1  = "javascript";
		
		
		String sub1 = s1.substring(4);//인덱스 번째부터 출력해줌
		System.out.println(sub1);
		
		String sub2 = s1.substring(0,4);//0번 인덱스부터 3번 인덱스까지의 부분 문자열
										//4-1까지
		
		System.out.println(sub2);
	}

	
}
