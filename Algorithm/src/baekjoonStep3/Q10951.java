package baekjoonStep3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10951 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer str;	
		String input = "";
		
		while ((input = br.readLine()) != null) {
			str = new StringTokenizer(input, " ");
			bw.write(Integer.parseInt(str.nextToken()) + Integer.parseInt(str.nextToken()) + "\n");				
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}
}
