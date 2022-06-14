package baekjoon.step13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] xy1 = br.readLine().split(" ");
		String[] xy2 = br.readLine().split(" ");
		String[] xy3 = br.readLine().split(" ");
		
		String x;
		if (xy1[0].equals(xy2[0])) {
			x = xy3[0];
			
		} else if (xy1[0].equals(xy3[0])) {
			x = xy2[0];
			
		} else {
			x = xy1[0];
			
		}
		
		String y;
		if (xy1[1].equals(xy2[1])) {
			y = xy3[1];
			
		} else if (xy1[1].equals(xy3[1])) {
			y = xy2[1];
			
		} else {
			y = xy1[1];
			
		}
		
		System.out.println(x + " " + y);
		
		br.close();
	}
}
