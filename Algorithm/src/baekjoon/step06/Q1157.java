package baekjoon.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().toUpperCase();
		int[] cnt = new int[26];
		int max = 0;
		char output = '?';
		for (int i = 0; i < input.length(); i++) {
			cnt[input.charAt(i)-65]++;
			if (max < cnt[input.charAt(i)-65]) {
				max = cnt[input.charAt(i)-65];
				output = input.charAt(i);
			} else if (max == cnt[input.charAt(i)-65]){
				output = '?';
			}
		}
		System.out.println(output);
	}
}
