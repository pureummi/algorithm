package baekjoonStep2;

import java.util.Scanner;

public class Q14681 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		if((-1000<=x && x<=1000 && x!=0)
				&&(-1000<=y && y<=1000 && y!=0)) {
			if(x>0 && y>0) {
				System.out.println("1");
			}else if(x<0 && y>0) {
				System.out.println("2");
			}else if(x<0 && y<0) {
				System.out.println("3");
			}else if(x>0 && y<0) {
				System.out.println("4");
			}
		}else {
			System.out.println("조건에 맞지 않은 입력입니다.");
		}
		sc.close();
	}
}
