package p11api.p02quiz;

import java.util.Scanner;

public class Ex01Length {
	//scanner
	//loop
	//입력받은 문자열이 몇 글자인지 출력하는 코드
	
	public static void main(String[] args) {
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		while(run) {
		System.out.print("입력>");
		String leng = scan.nextLine();
		System.out.println(leng.length() + "글자 입니다.");
		}
		
	}
		
}
