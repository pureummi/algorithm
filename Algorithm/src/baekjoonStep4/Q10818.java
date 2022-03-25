package baekjoonStep5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10818 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] array = new int[n];
		StringTokenizer str = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {	
			array[i] = Integer.parseInt(str.nextToken());
		}
		
		int temp = 0;
		for(int j = 0; j < array.length; j++) {
			for(int k = 0; k < array.length-1; k++) {
				if(array[k] > array[k+1]) {
					temp = array[k];
					array[k] = array[k+1];
					array[k+1] = temp;
				}
			}
		}
		
		bw.write(array[0] + " " + array[array.length-1]);
		bw.close();
	}
}
