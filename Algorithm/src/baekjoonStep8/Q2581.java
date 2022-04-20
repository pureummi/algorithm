package baekjoonStep8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q2581 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int[] result = new int[2];
		List<Integer> primeNum = new ArrayList<Integer>();
		for (int i = m; i <= n; i++) {
			int[] cnt = new int[i];
			for (int j = 1; j <= i; j++) {
				if ((i % j) == 0) {
					cnt[j-1] = i / j; 
				}
			}
			
			int zero = 0;
			for (int k = 0; k < cnt.length; k++) {
				if (cnt[k] == 0) {
					zero++;
				}
			}
			
			if ((cnt.length - zero) == 2) {
				result[0] += i;
				result[1]++;
				primeNum.add(i);
			}
			
		}
		
		if (result[0] == 0) {
			System.out.println(-1);

		} else {
			System.out.println(result[0]);
			System.out.println(primeNum.get(0));
		}
		
		br.close();
	}
}
