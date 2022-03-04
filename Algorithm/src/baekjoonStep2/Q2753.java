package baekjoonStep2;

import java.util.Scanner;

public class Q2753 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(1<=year&&year<=4000) {
			if(((year%4)==0)&&((year%100)!=0)
					||((year%4)==0)&&((year%400)==0)) {
				System.out.println("1");
			}else {
				System.out.println("0");			
			}
		}else {
			System.out.println("연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수입니다.");
		}
		sc.close();
	}
}
