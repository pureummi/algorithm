package baekjoonStep9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		
		System.out.println(fibonacci(input));
	
		br.close();
	}
	
	public static int fibonacci(int n) {
		if (n < 2) return n;
		
		return fibonacci(n-2) + fibonacci(n-1);
	}
}
