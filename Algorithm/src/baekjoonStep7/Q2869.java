package baekjoonStep7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(str.nextToken());
		int b = Integer.parseInt(str.nextToken());
		int v = Integer.parseInt(str.nextToken());
		int day = (v - b)/(a - b);
		
		if ((v - b)%(a - b) != 0) {
			day = day + 1;
		}
		
		System.out.println(day);
		br.close();
	}
}
