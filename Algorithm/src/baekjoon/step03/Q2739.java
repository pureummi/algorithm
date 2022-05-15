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
			System.out.println("n은 1보다 크거나 같고, 9보다 작거나 같은 조건입니다.");
		}
	}
}
