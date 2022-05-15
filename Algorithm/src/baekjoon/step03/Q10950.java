package baekjoon.step03;

import java.util.Scanner;

public class Q10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		int[] array = new int[t];

		for(int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if((0<a && a<10) && (0<b && b<10)) {
				array[i] = a + b;
			}else {
				System.out.println("0 < a,b < 10의 조건에 맞지 않습니다.");
			}
		}
		sc.close();

		for (int i : array) {
			System.out.println(i);
		}

	}
}
