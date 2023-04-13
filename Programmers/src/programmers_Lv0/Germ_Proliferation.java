package programmers_Lv0;

import java.util.Scanner;

public class Germ_Proliferation {
	public static void main(String[] args) {

		// 어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
		// 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때
		// t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.

		Scanner scanner = new Scanner(System.in);
		int germ, time, i = 0;

		System.out.print("세균 수 입력 : ");
		germ = Integer.parseInt(scanner.nextLine());
		System.out.print("경과 시간 입력 : ");
		time = Integer.parseInt(scanner.nextLine());

		while (i < time) {
			germ = germ * 2;
			i++;
		}
		System.out.printf("세균의 수 : %,d", germ);
		scanner.close();
	}
}
