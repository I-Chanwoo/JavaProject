package view;

import java.util.Scanner;

public class CafeView {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		try {
			while(true) {
				System.out.println("== 메인 홈 ==");
				System.out.println("[1] 주문하기");
				System.out.println("[2] ");
				System.out.println();
				int num = sc.nextInt();
				
				if(num == 1) {
					System.out.println("== 주문하기 ==");
					System.out.println("선택할 메뉴의 번호를 입력해주세요(선택 완료시 -1)");
					//con에서 menulist 받아오기
					while(true) {
						
					}
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
