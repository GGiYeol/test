package p11api.p02quiz;

import java.util.Scanner;

public class Ex07ReplceAll {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력: ");
		String str = scan.nextLine();
		
		String r = str.replaceAll("\s+", " ").trim();
	}
}
