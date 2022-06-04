package baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q18870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		int[] sorted = new int[n];
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = sorted[i] = Integer.parseInt(str.nextToken());
		}
		
		Arrays.sort(sorted);
		
		HashMap<Integer, Integer> hashMapRank = new HashMap<Integer, Integer>();
		
		int rank = 0;
		for (int i : sorted) {
			if (!hashMapRank.containsKey(i)) {
				hashMapRank.put(i, rank);
				rank++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i : arr) {
			int realRank = hashMapRank.get(i);
			sb.append(realRank).append(' ');
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
