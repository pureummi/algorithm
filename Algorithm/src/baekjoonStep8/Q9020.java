package baekjoonStep8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9020 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//4 ≤ n ≤ 10,000 이므로 n의 최댓값 +1
		boolean[] check = new boolean[10001];
		check[0] = check[1] = false;

		for (int i = 2; i < 10001; i++) {
			check[i] = true; 
		}

		for (int i = 2; i < 10001; i++) {
			if (!check[i]) continue;
			for (int j = i * i; j < 10001; j+=i) {
				if (check[i]) check[j] = false;
			}
		}

		int t = Integer.parseInt(br.readLine());
		String[] result = new String[t];
		
		for (int i = 0 ; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			int a = n / 2;
			int b = n / 2;
			while (true) {
				if (check[a] == true && check[b] == true) {
					result[i] = a + " " + b;
					break;
				}
				a--;
				b++;
			}
		}

		for (String s : result) {
			System.out.println(s);
		}
		
		br.close();
	}
}
