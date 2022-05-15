package baekjoon.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());;
		
		String[] input = new String[2];
		int max = 0;
		for (int i = 0; i < input.length; i++) {
			input[i] = str.nextToken();
			String reverse = "";
			for (int j = input[i].length()-1; j >= 0; j--) {
				reverse = reverse + input[i].charAt(j);
			}
			
			input[i] = reverse;

			if (max < Integer.parseInt(input[i])) {
				max = Integer.parseInt(input[i]);
			}
		}
		
		System.out.println(max);
	}
}
