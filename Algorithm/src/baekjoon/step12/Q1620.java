package baekjoon.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer str = new StringTokenizer(br.readLine());

		String[] pokemon = new String[Integer.parseInt(str.nextToken())];
		String[] question = new String[Integer.parseInt(str.nextToken())];

		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();

		for (int i = 0; i < pokemon.length; i++) {
			pokemon[i] = br.readLine();
			hashmap.put(pokemon[i], i+1);
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < question.length; i++) {
			question[i] = br.readLine();
			
			if (hashmap.containsKey(question[i])) {
				sb.append(hashmap.get(question[i])).append('\n');
			
			} else {
				sb.append(pokemon[Integer.parseInt(question[i])-1]).append('\n');
			}
		}
		
		System.out.println(sb.toString().trim());
		
		br.close();
	}
}
