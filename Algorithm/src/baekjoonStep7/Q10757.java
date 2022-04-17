package baekjoonStep7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q10757 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		BigInteger a = new BigInteger(str.nextToken());
		BigInteger b = new BigInteger(str.nextToken());
		
		System.out.println(a.add(b));
		br.close();
	}
}
