package baekjoon.step06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String s = "abcdefghijklmnopqrstuvwxyz";
	
		int[] array = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			array[i] = -1;
			
			for (int j = 0; j < input.length(); j++) {
				
				if (input.charAt(j) == s.charAt(i)) {
					array[i] = input.indexOf(s.charAt(i));
				} 
	
			}
		}
		
		for (int i : array) {
			System.out.print(i + " ");	
		}
		
	}
}
