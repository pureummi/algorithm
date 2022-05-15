package baekjoon.step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int a = n;
		int count = 0;
		
		/*
		 * do { n = ((n % 10)*10) + (((n / 10) + (n % 10))%10); count++;
		 * 
		 * } while(a != n);
		 */
		
		while(true) {
			n = ((n % 10)*10) + (((n / 10) + (n % 10))%10);
			count++;
			
			if(a == n) {
				break;
			}
		}
		
		System.out.println(count);
	
	}
}
