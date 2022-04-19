package baekjoonStep8;

import java.io.IOException;
import java.util.Scanner;

public class Q1978 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int result = 0;
		
		for (int i = 0; i < input; i++) {
			int num = sc.nextInt();
			
			int[] cnt = new int[num];
			if (num > 1) {
				for (int j = 1; j <= num; j++) {
					if ((num % j) == 0) {
						cnt[j-1] = num / j;
					}
				}
			}
			
			int zero = 0;
			for (int k = 0; k < num; k++) {
				if (cnt[k] == 0) {
					zero++;
				}
			}
			
			if (cnt.length - zero == 2) {
				result++;
			}
		}
		
		System.out.println(result);
		
		sc.close();
	}
}
