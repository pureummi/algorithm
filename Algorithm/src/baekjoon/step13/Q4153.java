package baekjoon.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			int c = Integer.parseInt(str.nextToken());
			
			if (a == 0 && b == 0 && c == 0) {
				break;
				
			} else {
				if ((a*a)+(b*b) == (c*c)) {
					sb.append("right").append('\n');
				
				} else if ((a*a)+(c*c) == (b*b)) {
					sb.append("right").append('\n');
				
				} else if ((b*b)+(c*c) == (a*a)) {
					sb.append("right").append('\n');
				
				}  else {
					sb.append("wrong").append('\n');
				}
			}
			
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
