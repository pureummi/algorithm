package baekjoonStep6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
	
		for (String s : alphabet) {
			if (input.contains(s)) {
				input = input.replaceAll(s, "!");
			}
		}
		
		System.out.println(input.length());
	}
}
