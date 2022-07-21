package baekjoon.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q1676 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		BigInteger result = BigInteger.valueOf(1);
		
		while (n >= 2) {
			result = result.multiply(BigInteger.valueOf(n));
			n--;
		}
		
		String resultStr = String.valueOf(result);
		
		int cnt = 0;
		
		for (int i = resultStr.length(); i >= 1; i--) {
			if (resultStr.substring(i-1, i).equals("0")) {
				cnt++;
			}
			
			if (cnt >= 1 && !resultStr.substring(i-1, i).equals("0")) {
				break;
			}
		}
		
		System.out.println(cnt);
		
		br.close();
	}
}
