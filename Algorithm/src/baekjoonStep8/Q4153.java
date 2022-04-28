package baekjoonStep8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
				int[] array = new int[3];
				array[0] = a * a;
				array[1] = b * b;
				array[2] = c * c;
				Arrays.sort(array);
				
				if (array[0] + array[1] == array[2]) {
					sb.append("right" + "\n");
					
				} else {
					sb.append("wrong" + "\n");
				}
			}
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
}
