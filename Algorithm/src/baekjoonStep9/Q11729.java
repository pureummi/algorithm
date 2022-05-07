package baekjoonStep9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11729 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		hanoi(n,1,3);
		
		System.out.println(cnt);
		System.out.println(sb);
		
		br.close();
	}
	
	static int cnt = 0;
	static StringBuilder sb = new StringBuilder();
	static void hanoi(int n, int x , int y) {
		//±âµÕ 3°³ °¢°¢À» 1, 2, 3ÀÌ¶ó°í ÇÒ ¶§ ±âµÕÀÇ ÇÕÀº 1+2+3 = 6
		//x±âµÕ + y±âµÕ + ³²Àº±âµÕ = 6
		//³²Àº ±âµÕ = 6-x-y
		if (n > 1) hanoi(n-1, x, 6-x-y);
		cnt++;
		sb.append(x + " " + y + "\n");
		if (n > 1) hanoi(n-1, 6-x-y, y);
	}
}
