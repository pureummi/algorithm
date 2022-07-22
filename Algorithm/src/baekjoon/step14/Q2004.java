package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2004 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(str.nextToken());
		int m = Integer.parseInt(str.nextToken());
		
		int cntFive = fiveExponent(n) - fiveExponent(m) - fiveExponent(n-m); 
		int cntTwo = twoExponent(n) - twoExponent(m) - twoExponent(n-m); 
		
		System.out.println(Math.min(cntFive, cntTwo));
		
		br.close();
	}
	
	static int fiveExponent(int a) {
		int cnt = 0;
		
		while (a >= 5) {
			cnt += a/5;
			a = a/5;
		}
		
		return cnt;
	}
	
	static int twoExponent(int a) {
		int cnt = 0;
		
		while (a >= 2) {
			cnt += a/2;
			a = a/2;
		}
		
		return cnt;
	}
}
