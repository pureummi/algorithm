package baekjoonStep7;

import java.util.Scanner;

public class Q1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int line = 1;
		int top = 0, bottom = 0;
		int cnt = 0;
		boolean check = false;
		
		while (!check) {
			if (line % 2 == 1) {
				bottom = 0;
				
				for (top = line; top >= 1; top--) {
					bottom++;
					cnt++;
					
					if (cnt == input) {
						check = true;
						break;
					}
				}
				
			}else if (line % 2 == 0) {
				bottom = line + 1;
				
				for (top = 1; top <= line; top++) {
					bottom--;
					cnt++;
					
					if (cnt == input) {
						check = true;
						break;
					}
				}
			}
			
			line++;
		}
		
		System.out.println(top + "/" + bottom);
		sc.close();
	}
}
