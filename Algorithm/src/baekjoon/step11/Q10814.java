package baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10814 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[][] array = new String[n][2];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			array[i][0] = str.nextToken();
			array[i][1] = str.nextToken();
		}
		
		Arrays.sort(array, (o1, o2) -> {
			return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
		});
		
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			sb.append(array[i][0] + " " + array[i][1]).append('\n');
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
