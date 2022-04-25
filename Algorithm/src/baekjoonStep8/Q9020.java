package baekjoonStep8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q9020 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		String[] result = new String[t];

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());

			boolean[] check = new boolean[n+1];
			check[0] = check[1] = false;

			for (int j = 2; j <= n; j++) {
				check[j] = true;
			}

			for (int j = 2; j <= n; j++) {
				if(!check[j]) continue;
				for (int k = 2*j; k <= n; k += j) {
					if (check[k]) {
						check[k] = false;
					}
				}
			}

			for (int j = n; j >= 0; j--) {
				if (check[j]) {
					list.add(j);
				}
			}

			String output = "";
			for (int j = 0; j < list.size(); j++) {
				for (int k = 0; k < list.size(); k++) {
					int gap = list.get(j) - list.get(k);
					if ((n - list.get(j) == list.get(k))) {
						if (gap == 0) {
							output = list.get(j) + " " + list.get(k);

						} else if (gap > 0) {
							output = list.get(k) + " " + list.get(j);
						}
					} 
				}
			}

			result[i] = output;
		}
		
		for (String s: result) {
			System.out.println(s);
		}
		
		br.close();
	}
}
