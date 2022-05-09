package baekjoonStep10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2231 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		String copy = String.valueOf(n);
		int min = 0;
		while (!copy.equals("0")) {//copy가 0이 될 때까지 반복
			int[] array = new int[copy.length()];
			
			int sum = 0;
			for (int i = 0; i < array.length; i++) {
				array[i] = copy.charAt(i) - '0';
				sum += array[i];
			}
		
			if (sum + Integer.parseInt(copy) == n) {
				min = Integer.parseInt(copy);
			} 
			
			copy = String.valueOf(Integer.parseInt(copy) - 1); //copy 1씩 감소
			
		}
		
		System.out.println(min);
		
		br.close();
	}
}
