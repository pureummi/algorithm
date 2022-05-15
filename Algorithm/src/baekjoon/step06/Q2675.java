package baekjoon.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());;

		StringTokenizer str;
		int[] inputNum = new int[input];
		String[] inputStr = new String[input];

		for (int i = 0; i < input; i++) {
			str = new StringTokenizer(br.readLine());	
			inputNum[i] = Integer.parseInt(str.nextToken());
			inputStr[i] = str.nextToken();
		}

		for (int i = 0; i < input; i++) {
			for (int j = 0; j < inputStr[i].length(); j++) {
				for (int k = 0; k < inputNum[i]; k++) {
					System.out.print(inputStr[i].charAt(j));
				}
			}

			System.out.println();
		}
	}
}
