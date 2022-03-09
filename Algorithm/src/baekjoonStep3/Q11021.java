package baekjoonStep3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q11021 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine()); 
		StringTokenizer str;
		for(int i = 0; i < a; i++) {
			str = new StringTokenizer(br.readLine());
			bw.write("Case #" + (i+1) + ": " + (Integer.parseInt(str.nextToken()) + Integer.parseInt(str.nextToken())) + "\n");
		}
		
		bw.close();
	}
}
