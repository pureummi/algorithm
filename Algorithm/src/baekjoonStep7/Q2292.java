package baekjoonStep7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int i = 1;
		while (input > 1) {
			input -= (6 * i);
			i += 1;
		}
		System.out.println(i);
	}
}
