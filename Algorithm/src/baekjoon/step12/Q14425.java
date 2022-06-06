package baekjoon.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(str.nextToken());
		int m = Integer.parseInt(str.nextToken());
		
		String[] arrN = new String[n];
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			arrN[i] = br.readLine();
			hashMap.put(arrN[i], cnt);
		}
		
		String[] arrM = new String[m];
		
		for (int i = 0; i < m; i++) {
			arrM[i] = br.readLine();
			if (hashMap.containsKey(arrM[i])) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		br.close();
	}
}
