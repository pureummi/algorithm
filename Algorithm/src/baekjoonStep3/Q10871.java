package baekjoonStep3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(str.nextToken());
		int x = Integer.parseInt(str.nextToken());

		str = new StringTokenizer(br.readLine());
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(str.nextToken());
		}
		
		for(int j = 0; j < array.length; j++) {
			if(array[j] < x) {
				bw.write(array[j] + " ");
			}
		}
		
		bw.close();
	}
}
