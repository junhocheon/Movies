package movie;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckMem {
	Scanner sc = new Scanner(System.in);
	String id;
	String number;
	String ticket;
	CheckReserv crs = new CheckReserv();
	public void check() {
		System.out.println("회원은 1번 비회원은 2번");
		int num = Integer.parseInt(sc.nextLine());
		if (num == 1) {
			member();
		} else if (num == 2) {
			nonMb();
		} else {
			System.out.println("잘못 입력 하셧습니다");
		}

	}

	public void member() {
		System.out.println("ID를 입력해 주세요");
		String name = sc.nextLine();
		crs.find(name);
	}

	public void nonMb() {
		System.out.println("예매 번호 또는 전화번호를 입력해 주세요\nex).010-1234-5678");
		String name = sc.nextLine();
		crs.nonfind(name);
	}

}
