package baekjoonStep8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1002 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < t; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());

			int x1 = Integer.parseInt(str.nextToken());
			int y1 = Integer.parseInt(str.nextToken());
			int r1 = Integer.parseInt(str.nextToken());

			int x2 = Integer.parseInt(str.nextToken());
			int y2 = Integer.parseInt(str.nextToken());
			int r2 = Integer.parseInt(str.nextToken());

			//Math.abs(x-x1) + Math.abs(y-y1) = r1
			//Math.abs(x-x2) + Math.abs(y-y2) = r2
			int cnt = 0;
			for (int j = -10000; j <= 10000; j++) {
				int x = j;
				for (int k = -10000; k <= 10000; k++) {
					int y = k;
					if (Math.abs(x-x1) + Math.abs(y-y1) == r1 && Math.abs(x-x2) + Math.abs(y-y2) == r2) {
						cnt++;
					}
				}
			}
			
			sb.append(cnt + "\n");
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
}
