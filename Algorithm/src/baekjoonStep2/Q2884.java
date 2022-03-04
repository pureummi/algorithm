package baekjoonStep2;

import java.util.Scanner;

public class Q2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h, m;
		h = sc.nextInt();
		m = sc.nextInt();
		if((0<=h && h<=23)&&(0<=m && m<=59)) {
			if(((h-1)>0) && ((m-45)>0)) {
				System.out.println(h + " " + (m-45));
			}else if(((h-1)>0) && ((m-45)<0)) {
				System.out.println((h-1) + " " + (m-45+60));
			}else if(((h-1)<0) && ((m-45)>0)) {
				System.out.println(h + " " + (m-45));				
			}else if(((h-1)<0) && ((m-45)<0)) {
				System.out.println((h-1+24) + " " + (m-45+60));				
			}else if(((h-1)==0) && ((m-45)>0)) {
				System.out.println(h + " " + (m-45));				
			}else if(((h-1)==0) && ((m-45)<0)) {
				System.out.println(0 + " " + (m-45+60));				
			}
		}else {
			System.out.println("조건에 맞지 않은 입력입니다.");
		}
		sc.close();
	}
}
