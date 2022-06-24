package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5086 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			StringTokenizer str = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			
			if (a == 0 && b == 0) {
				break;
				
			} else {
				if (b % a == 0) {
					sb.append("factor").append('\n');
				
				} else if (a % b == 0) {
					sb.append("multiple").append('\n');
					
				} else {
					sb.append("neither").append('\n');
				
				}
				
			}
		}
		
		System.out.println(sb.toString().trim());
		
		br.close();
	}
}
