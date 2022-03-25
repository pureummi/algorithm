package baekjoonStep5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] array = new int[9];
		int[] copy;
	
		for(int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		copy = array;
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
		
		int result = Arrays.binarySearch(copy, array[array.length-1]);
		bw.write(array[array.length-1] + "\n" + result);
		bw.close();
	}
}
