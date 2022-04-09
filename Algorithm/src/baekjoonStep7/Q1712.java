package baekjoonStep7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1712 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(str.nextToken());
		int b = Integer.parseInt(str.nextToken());
		int c = Integer.parseInt(str.nextToken());
		
		int result = BreakEvenPoint(a, b, c);
		if (result > 0) {
			System.out.println(result + 1);
		} else if (result <= 0) {
			System.out.println(-1);
		}
	}
	
	public static int BreakEvenPoint(int a, int b, int c) {
		//a + (b * x) < c * x;
		//(c-b) * x > a
		//x > a / (c -b)
		return (a / (c -b)); 
	}
}
