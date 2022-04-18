package baekjoonStep7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10757 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer str = new StringTokenizer(br.readLine());
		String a = str.nextToken();
		String b = str.nextToken();

		int length = Math.max(a.length(), b.length());

		int[] A = new int[length+1];
		int[] B = new int[length+1];

		for (int i = a.length()-1, j = 0; i >= 0; i--, j++) {
			A[j] = a.charAt(i) - '0';
		}

		for (int i = b.length()-1, j = 0; i >= 0; i--, j++) {
			B[j] = b.charAt(i) - '0';
		}

		for (int k = 0; k < length; k++) {
			int sum = A[k] + B[k];
			A[k] = sum % 10;
			A[k+1] += (sum / 10);
		}

		StringBuilder sb = new StringBuilder();
		if (A[length] != 0) {
			sb.append(A[length]);
		} 
		
		for (int n = length-1; n >= 0; n--) {
			sb.append(A[n]);
		}

		System.out.println(sb);
	}
}
