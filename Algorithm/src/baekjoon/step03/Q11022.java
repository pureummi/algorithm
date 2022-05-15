package baekjoon.step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11022 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < a; i++) {
			String str = br.readLine();
			int result = str.indexOf(" ");
			int num1 = Integer.parseInt(str.substring(0, result));
			int num2 = Integer.parseInt(str.substring(result+1));
			bw.write("Case #" + (i+1) + ": " + num1 + " + " + num2 + " = " + (num1+num2) + "\n");
		}
		
		bw.close();
	}
}
