package baekjoon.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1358 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		int	w = Integer.parseInt(str.nextToken());
		int	h = Integer.parseInt(str.nextToken());
		int	x = Integer.parseInt(str.nextToken());
		int	y = Integer.parseInt(str.nextToken());
		int	p = Integer.parseInt(str.nextToken());
		int r = h/2;
		
		int cnt = 0;
		for (int i = 0; i < p; i++) {
			str = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(str.nextToken()); 
			int b = Integer.parseInt(str.nextToken()); 
			
			int distance1 = (int)Math.pow(x-a, 2) + (int)Math.pow(y+r-b, 2);
			int distance2 = (int)Math.pow(x+w-a, 2) + (int)Math.pow(y+r-b, 2);
			
			if (distance1 <= Math.pow(r, 2) 
					|| distance2 <= Math.pow(r, 2)
					|| (a >= x && a <= x+w && b >= y && b <= y+h)) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		br.close();
	}
}
