package baekjoonStep10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(str.nextToken());
		int m = Integer.parseInt(str.nextToken());
		
		int[] cards = new int[n];
		
		str = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			cards[i] = Integer.parseInt(str.nextToken());
		}
		
		int max = 0;
		for (int i = 0; i < cards.length-2; i++) {
			for (int j = i+1; j < cards.length-1; j++) {
				for (int k = j+1; k < cards.length; k++) {
					int sum = cards[i] + cards[j] + cards[k];
					
					if (sum <= m) {
						max = Math.max(max, sum);
					}
				}
			}
		}
		
		System.out.println(max);
		br.close();
	}
}
