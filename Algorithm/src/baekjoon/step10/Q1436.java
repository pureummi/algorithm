package baekjoon.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1436 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		String result = "0";
		while (cnt != n) {//cnt == n 이면 while문 종료
			
			result = String.valueOf(Integer.parseInt(result) + 1); //result 1씩 증가
			
			if (result.contains("666")) {//result가 666을 포함하면 cnt 1씩 증가
				cnt++;
			}
			
		}
		
		System.out.println(result);
		
		br.close();
	}
}
