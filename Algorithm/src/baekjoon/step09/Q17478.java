package baekjoon.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q17478 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());

		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		funcRecursion(input);
		
		br.close();
	}
	
	static String underbar = "";
	public static void funcRecursion(int n) {
		String line = underbar;
		
		if (n == 0) {
			System.out.println(line + "\"����Լ��� ������?\"");
			System.out.println(line + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			System.out.println(line + "��� �亯�Ͽ���.");
			return;
		}
		
		System.out.println(line + "\"����Լ��� ������?\"");
		System.out.println(line + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
		System.out.println(line + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
		System.out.println(line + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
		
		underbar += "____";
		
		funcRecursion(n-1);
		
		System.out.println(line + "��� �亯�Ͽ���.");
	}
}
