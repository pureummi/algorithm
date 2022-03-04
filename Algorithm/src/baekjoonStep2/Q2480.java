package baekjoonStep2;

import java.util.Scanner;

public class Q2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if((1<=a && a<=6) && (1<=b && b<=6) && (1<=c && c<=6)) {
			if(a==b && b==c) {
				System.out.println(10000 + (a*1000));
			}else if(a==b) {
				System.out.println(1000 + (a*100));				
			}else if(b==c) {
				System.out.println(1000 + (b*100));				
			}else {
				if(a>b && a>c) {
					System.out.println(a*100);					
				}else if(b>a && b>c) {
					System.out.println(b*100);										
				}else if(c>a && c>b) {
					System.out.println(c*100);															
				}
			}
		}else {
			System.out.println("주사위는 1부터 6까지의 눈을 갖는 조건입니다.");
		}
		sc.close();
	}
}
