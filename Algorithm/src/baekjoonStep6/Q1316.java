package baekjoonStep6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int cnt = input;
		
		for (int i = 0; i < input; i++) {
			String str = br.readLine();
			char[] word = str.toCharArray();
			boolean check = false;
			for (int j = 0; j < word.length; j++) {
				for (int k = word.length - 1; k >= j + 2; k--) {
					if (j != k && word[j] == word[k]) {
						check = true;
					}
				}	
			}
			
			if (check == true) {
				cnt = cnt - 1;
			}
		}
		
		System.out.println(cnt);
	}
}
