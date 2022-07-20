package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Q9375 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < testCase; i++) {
			int n = Integer.parseInt(br.readLine());
			
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			
			for (int j = 0; j < n; j++) {
				StringTokenizer str = new StringTokenizer(br.readLine());

				String name = str.nextToken();
				String type = str.nextToken();
				
				if (!map.containsKey(type)) {
					map.put(type, map.getOrDefault(type, 1));
					
				} else {
					map.replace(type, map.get(type)+1);
				}
			}
			
			int result = 1;
			
			Iterator<String> keys = map.keySet().iterator();
			
			while (keys.hasNext()) {
				String key = keys.next();
				result *= (map.get(key) + 1);
			}
			
			sb.append(result-1).append('\n');
			
		}
		
		System.out.println(sb.substring(0, sb.length()-1));
	}
}
