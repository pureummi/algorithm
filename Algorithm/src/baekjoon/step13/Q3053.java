package baekjoon.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Q3053 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int r = Integer.parseInt(br.readLine());
		
		//유클리드 기하학에서 원의 넓이
		double areaU = r*r*Math.PI;
		//택시 기하학에서 원의 넓이
		double areaT = 2*r*r;
		
		DecimalFormat df = new DecimalFormat("0.000000");
		
		System.out.println(df.format(areaU));
		System.out.println(df.format(areaT));
		
		br.close();
	}
}
