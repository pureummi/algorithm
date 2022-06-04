package baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10814 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] array = new String[n];
		int[] age = new int[n];
		String[] name = new String[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = br.readLine();
			StringTokenizer str = new StringTokenizer(array[i]);
			age[i] = Integer.parseInt(str.nextToken());
			name[i] = str.nextToken();
		}
		
		for (int i = 1; i < n; i++) {
			int targetAge = age[i];
			String targetArray = array[i];
			int j = i-1;
			
			while (j >= 0 && age[j] > targetAge) {
				age[j+1] = age[j];
				array[j+1] = array[j];
				j--;
			}
			
			age[j+1] = targetAge;
			array[j+1] = targetArray;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (String s : array) {
			sb.append(s).append('\n');
		}
		System.out.println(sb);
		
		br.close();
	}
}
