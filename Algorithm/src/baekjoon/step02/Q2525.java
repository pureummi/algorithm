package baekjoon.step02;

import java.util.Scanner;

public class Q2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if((0<=a && a<=23) && (0<=b && b<=59) && (0<=c && c<=1000)) {
			if((b+c)<60) {
				System.out.println(a + " " + (b+c));
			}else if((b+c)>=60) {
				int d = a+((b+c)/60);
				if(d==24) {
					System.out.println(0 + " " + ((b+c)%60));									
				}else {
					System.out.println(d + " " + ((b+c)%60));									
				}
			}
		}else {
			System.out.println("조건에 맞지 않은 입력입니다.");
		}
		sc.close();
	}
}
