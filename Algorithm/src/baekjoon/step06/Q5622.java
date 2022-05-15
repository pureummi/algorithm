package baekjoon.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5622 {
	public static void main(String[] args) throws IOException {
		//WA 10 3 -->13
		//UNUCIC 9 7 9 3 5 3 -->36
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().toCharArray();
		String[] dial = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
		int output = 0;
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < dial.length; j++) {
				if (dial[j].contains(String.valueOf(input[i]))) {
					output = output + (j + 3);
				}
			}	
		}
		
		System.out.println(output);
	}
}
