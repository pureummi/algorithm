package baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Q1181 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String[] array = new String[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = br.readLine();
		}
		
		Arrays.sort(array, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() == o2.length()) {
					return o1.compareTo(o2);
					
				} else {
					return o1.length() - o2.length();
				} 
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(array[0]).append('\n');
		
		for (int i = 1; i < n; i++) {
			if (!array[i-1].equals(array[i])) {
				sb.append(array[i]).append('\n');
			}
		}
		System.out.println(sb);
		
		br.close();
	}
}
