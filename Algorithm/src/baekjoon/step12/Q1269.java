package baekjoon.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Q1269 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(str.nextToken());
		int b = Integer.parseInt(str.nextToken());
		
		Set<Integer> set = new HashSet<Integer>();
		
		str = new StringTokenizer(br.readLine());
		for (int i = 0; i < a; i++) {
			set.add(Integer.parseInt(str.nextToken()));
		}
		
		str = new StringTokenizer(br.readLine());
		int cnt = 0;
		for (int i = 0; i < b; i++) {
			int num = Integer.parseInt(str.nextToken());
			if (set.contains(num)) {//중복값을 포함할 경우, cnt 증가
				cnt++;
				
			} else {
				set.add(num);
			}
		}
		
		//대칭 차집합 개수
		//집합A 의 개수 a에 중복값 개수 cnt를 뺀 값 + 집합B 의 개수 b에 중복값 개수 cnt를 뺀 값
		System.out.println((a-cnt) + (b-cnt));
		
		br.close();
	}
}
