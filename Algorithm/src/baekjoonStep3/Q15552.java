package baekjoonStep3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer str;
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) {
			str = new StringTokenizer(br.readLine());
			bw.write((Integer.parseInt(str.nextToken()) + Integer.parseInt(str.nextToken()))+ "\n");
		}
		
		bw.close();
	}
}
