package baekjoon.step03;

import java.util.Scanner;

public class Q2739 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(1<=n && n<=9) {
			for (int i = 1; i < 10; i++) {
				System.out.println(n + " * " + i + " = " + (n*i));
			}
			sc.close();
		}else {
			System.out.println("n�� 1���� ũ�ų� ����, 9���� �۰ų� ���� �����Դϴ�.");
		}
	}
}
