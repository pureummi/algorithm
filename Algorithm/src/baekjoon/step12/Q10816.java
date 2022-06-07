package baekjoon.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			int card = Integer.parseInt(str.nextToken());
			hashmap.put(card, hashmap.getOrDefault(card, 0) + 1);
		}
		
		int m = Integer.parseInt(br.readLine());

		str = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < m; i++) {
			int check = Integer.parseInt(str.nextToken());
			sb.append(hashmap.getOrDefault(check, 0)).append(' ');
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb);
		
		br.close();
	}
}
