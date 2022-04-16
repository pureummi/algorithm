package baekjoonStep7;

import java.util.Scanner;

public class Q2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if (((input % 5) % 3) != 0) {
			System.out.println(-1);
		} else {
			System.out.println((input / 5) + ((input % 5) / 3));
		}
		
		sc.close();
	}
}
