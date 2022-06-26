package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1037 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] divisor = new int[Integer.parseInt(br.readLine())];
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < divisor.length; i++) {
			divisor[i] = Integer.parseInt(str.nextToken());
		}
		
		Arrays.sort(divisor);
		
		System.out.println(divisor[0] * divisor[divisor.length-1]);
		
		br.close();
	}
}
