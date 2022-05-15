package baekjoon.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q4948 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> list = new ArrayList<Integer>();
		while (true) {
			int input = Integer.parseInt(br.readLine());
			if (input != 0) {
				list.add(primeNum(input));
				
			}else if (input == 0) {
				break;
			}
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));;
		}
		
		br.close();
	}

	public static int primeNum(int n) {
		boolean[] check = new boolean[(2 * n) + 1];

		check[0] = check[1] = false;

		for (int i = 2; i <= (2 * n); i++) {
			check[i] = true;
		}

		for (int i = 2; i * i <= (2 * n); i++) {
			if (!check[i]) continue;
			for (int j = i * i; j <= (2 * n); j += i) {
				check[j] = false;
			}

		}

		int cnt = 0;
		for (int i = (n + 1); i <= (2 * n); i++) {
			if (check[i]) {
				cnt += 1;
			}
		}

		return cnt;
	}
}
