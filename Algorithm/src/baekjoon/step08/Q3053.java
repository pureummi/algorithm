package baekjoon.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3053 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double input = Double.parseDouble(br.readLine());
		
		System.out.println(Math.PI * input * input);
		System.out.println(2 * input * input);
		
		br.close();
	}
}
