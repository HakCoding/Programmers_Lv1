package programmers_Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Continuou_Num_Sum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList());

		int num, total, midNum, sum, i;

		System.out.print("num 입력 : ");
		num = Integer.parseInt(scanner.nextLine());
		System.out.print("total 입력 : ");
		total = Integer.parseInt(scanner.nextLine());

		midNum = total / num;
		i = 1;
		sum = midNum;
		arr.add(midNum);

		while (sum != total) {
			if (sum != total) {
				arr.add(midNum + i);
				sum = sum + midNum + i;
				i = i * -1;
			}
			if (arr.size() % 2 == 1) {
				i++;
			}
		}

		Collections.sort(arr);
		System.out.println(arr.toString());
		scanner.close();
	}
}