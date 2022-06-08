package baekjoon.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class Q1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer str = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(str.nextToken());
		int m = Integer.parseInt(str.nextToken());

		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();

		String[] nameN = new String[n];
		for (int i = 0; i < n; i++) {
			nameN[i] = br.readLine();
			hashmap.put(nameN[i], 0);
		}

		int cnt = 0;
		for (int i = 0; i < m; i++) {
			String name = br.readLine();

			if (hashmap.containsKey(name)) {
				hashmap.replace(name, hashmap.get(name)+1);
				cnt++;
			}
		}

		Set<Entry<String, Integer>> entrySet = hashmap.entrySet();

		String[] result = new String[cnt];

		int idx = 0;
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 0) {
				result[idx] = entry.getKey();
				idx++;
			}
		}

		Arrays.sort(result);

		StringBuilder sb = new StringBuilder();
		
		sb.append(cnt).append('\n');
		
		for (String s : result) {
			sb.append(s).append('\n');
		}

		System.out.println(sb.toString().trim());

		br.close();
	}
}
