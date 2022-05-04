package baekjoonStep9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2447 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		recursionStar(input);
		br.close();
	}

	public static void recursionStar(int n) {
		if (n <= 3) {
			for(int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (j >= (n/3) && j <= ((2*(n/3))-1) 
							&& i >= (n/3) && i <= ((2*(n/3))-1)) {
						System.out.print(" ");

					}else {
						System.out.print("*");

					}
				}
				System.out.println("");
			}

		} else if (n > 3) {
			for(int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (j >= (n/3) && j <= ((2*(n/3))-1) 
							&& i >= (n/3) && i <= ((2*(n/3))-1)) {
						System.out.print(" ");

					}else {
						System.out.print("*");

					}
				}
				System.out.println("");

			}
		}


	}
}
