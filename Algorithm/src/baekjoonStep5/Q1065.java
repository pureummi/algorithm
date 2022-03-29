package baekjoonStep5;

import java.util.Scanner;

public class Q1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		input(sc.nextInt());
		sc.close();
	}
	
	public static void input(int n) {
		int cnt = 0;
		
		for (int i = 1; i <= n; i++) {
			if (i <= 99) {
				cnt += 1;
			} else if (i <= 999) {
				String [] s = Integer.toString(i).split("");
				if ((Integer.parseInt(s[1]) - Integer.parseInt(s[0])) == (Integer.parseInt(s[2]) - Integer.parseInt(s[1]))) {
					cnt += 1;
				}
			}
		}
		
		System.out.println(cnt);
	}
}
