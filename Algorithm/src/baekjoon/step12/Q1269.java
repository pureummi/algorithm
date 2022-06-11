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
			if (set.contains(num)) {//�ߺ����� ������ ���, cnt ����
				cnt++;
				
			} else {
				set.add(num);
			}
		}
		
		//��Ī ������ ����
		//����A �� ���� a�� �ߺ��� ���� cnt�� �� �� + ����B �� ���� b�� �ߺ��� ���� cnt�� �� ��
		System.out.println((a-cnt) + (b-cnt));
		
		br.close();
	}
}
