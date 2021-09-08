package p06class.p01textbook.exercises.p20;

import java.util.Scanner;

public class BankAccount  {
	
	static Account[] accountArray = new Account[100];
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		boolean run = true;
		while(true) {
		System.out.println("------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("------------------------------------------");
		System.out.print("선택>");
		int a = scan.nextInt();
		System.out.println("---------------------");
		
		switch (a) {
		
		case 1:
			createAccount();
			break;

		case 2:
			accountList();
			break;
		case 3:
//			deposti();
			break;
		case 4:
//			withdraw();
			break;
		case 5:
			run = false;
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			break;
			}
		}
//		System.out.println("프로그램 종료");
	}
	
	public static void createAccount() {
		System.out.print("계좌번호: ");
		String ano = scan.next();
		System.out.print("계좌주: ");
		String owner = scan.next();
		System.out.print("초기입금액");
		int balance = scan.nextInt();
		
		Account newAccount = new Account(ano,owner, balance);
		for(int i = 0; i<accountArray.length;i++) {
			accountArray[i] = newAccount;
			if(accountArray[i] == null) break;
		}
	
	}
	
	public static void accountList() {
		for(int i = 0; i<accountArray.length;i++) {
			if(accountArray[i] != null) {
			System.out.println(accountArray[i]);
			}else break;
		}
	}
	
	public static void deposit() {
		
	}
	
	
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		System.out.print("계좌번호: ");
		if(ano == scan.next()) {
			System.out.print("예금액: ");
			
		}else {
			System.out.println("정보가 없습니다");
		}
		
		return null;
	}
	
	
	
	
	
	
	
}
