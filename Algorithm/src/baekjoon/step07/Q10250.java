package baekjoon.step07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10250 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		String[] result = new String[input];
		
		for (int i = 0; i < input; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(str.nextToken());
			int w = Integer.parseInt(str.nextToken());
			int n = Integer.parseInt(str.nextToken());
			
			String[] room = new String[w*h];
			int cnt = 0;
			
			for (int j = 1; j <= w; j++) {
				for (int k = 1; k <= h; k++) {
					cnt++;
					
					if (j < 10) {
						room[cnt-1] = k + "0" + j;
					} else {
						room[cnt-1] = k + "" + j;
					}
				}
			}
			
			result[i] = room[n-1];
		}

		for (String s : result) {
			System.out.println(s);
		}
	}
}
