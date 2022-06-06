package baekjoon.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q10815 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] card = new int[n];
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			card[i] = Integer.parseInt(str.nextToken());
		}
		
		int m = Integer.parseInt(br.readLine());
		int[] check = new int[m];
		str = new StringTokenizer(br.readLine());
		
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < m; i++) {
			check[i] = Integer.parseInt(str.nextToken());
			hashMap.put(check[i], 0);
		}
		
		for (int i : card) {
			if (hashMap.containsKey(i)) {
				hashMap.replace(i, 1);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i : check) {
			sb.append(hashMap.get(i)).append(' ');
		}
		System.out.println(sb);
		
		br.close();
		
	}
}
