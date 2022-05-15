package baekjoon.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10872 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		
		System.out.println(factorial(input));
		
		br.close();
	}
	
	public static int factorial(int n) {
		
		if (n <= 1) return 1;
		
		return n * factorial(n - 1);
	}
}
