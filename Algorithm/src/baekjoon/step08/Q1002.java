package baekjoon.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1002 {//�� ���� ������ ������ ���ϴ� ����
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < t; i++) {
			StringTokenizer str = new StringTokenizer(br.readLine());

			int x1 = Integer.parseInt(str.nextToken());
			int y1 = Integer.parseInt(str.nextToken());
			int r1 = Integer.parseInt(str.nextToken());

			int x2 = Integer.parseInt(str.nextToken());
			int y2 = Integer.parseInt(str.nextToken());
			int r2 = Integer.parseInt(str.nextToken());

			sb.append(intersection_point(x1, y1, r1, x2, y2, r2) + "\n");
		}
		
		System.out.println(sb.toString());
		
		br.close();
	}
	
	public static int intersection_point(int x1, int y1, int r1, int x2, int y2, int r2) {
		int cnt = 0;
		
		//�� ���� ���� �� : ���Ѵ�
		if (x1 == x2 && y1 == y2 && r1 == r2) {
			cnt = -1;
		
		} 
		//�ϳ��� ���� �ٸ� �ϳ��� �� �ȿ� ������ ������ ���� �� : 0��
		else if (Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) < Math.pow(r2-r1, 2)) { 
			cnt = 0;
			
		}
		//�� ���� ������ �Ÿ��� �� ���� �������� �պ��� Ŭ �� : 0��
		else if (Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) > Math.pow(r2+r1, 2)) { 
			cnt = 0;
			
		}
		//������ �� : 1��
		else if (Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) == Math.pow(r2-r1, 2)) { 
			cnt = 1;
			
		}
		//������ �� : 1��
		else if (Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) == Math.pow(r2+r1, 2)) { 
			cnt = 1;
			
		} 
		else {
			cnt = 2;
		}
		
		return cnt;
	}
}
