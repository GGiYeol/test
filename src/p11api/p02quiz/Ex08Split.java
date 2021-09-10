package p11api.p02quiz;

import java.util.Scanner;

public class Ex08Split {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력문자열: ");
		String input = scan.nextLine();
		
		System.out.print("구분자");
		String dm = scan.nextLine();
		
		//코드작성
		String[] arr = input.split(dm);
		
		for(String out : arr) {
			System.out.println(out);
		}
	}
}
