package baekjoon.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Q3053 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int r = Integer.parseInt(br.readLine());
		
		//��Ŭ���� �����п��� ���� ����
		double areaU = r*r*Math.PI;
		//�ý� �����п��� ���� ����
		double areaT = 2*r*r;
		
		DecimalFormat df = new DecimalFormat("0.000000");
		
		System.out.println(df.format(areaU));
		System.out.println(df.format(areaT));
		
		br.close();
	}
}
