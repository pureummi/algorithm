package baekjoon.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class Q1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer str = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(str.nextToken());
		int m = Integer.parseInt(str.nextToken());

		String[] pokemon = new String[n];
		String[] question = new String[m];

		HashMap<String, String> hashmap = new HashMap<String, String>();

		for (int i = 0; i < n; i++) {
			pokemon[i] = br.readLine();
			hashmap.put(pokemon[i], String.valueOf(i+1));
		}

		for (int i = 0; i < m; i++) {
			question[i] = br.readLine();
		}

		StringBuilder sb = new StringBuilder();
		
		Set<Entry<String, String>> entrySet = hashmap.entrySet();
		
		for (int i = 0; i < m; i++) {
			if (hashmap.containsKey(question[i])) {
				sb.append(hashmap.get(question[i])).append('\n');
			} 
			
			for (Entry<String, String> entry : entrySet) {
				if (entry.getValue().equals(question[i])) {
					sb.append(entry.getKey()).append('\n');
				}
			}
		}
		
		System.out.println(sb.toString().trim());
		br.close();
	}
}
