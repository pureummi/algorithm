package baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		//n의 절댓값이 4000을 넘지 않아야함. -4000~4000 
		int[] array = new int[8001];
		
		int sum = 0;
		int max = Integer.MIN_VALUE; //최댓값
		int min = Integer.MAX_VALUE; //최솟값
		int median = 4001; //중앙값
		int mode = 4001; //최빈값
		
		for (int i = 0; i < n; i++) {
			int value = Integer.parseInt(br.readLine());
			sum += value;
			array[value + 4000]++;
			
			if (max < value) max = value;
			if (min > value) min = value;
		}
		
		int cnt = 0;
		int modeMax = 0; //최빈값의 최댓값
		boolean check = false;
		
		for (int i = min+4000; i <= max+4000; i++) {
			if (array[i] > 0) {
				if (cnt < (n+1)/2) {
					cnt += array[i];
					median = i - 4000;
				}
				
				if (modeMax < array[i]) {
					modeMax = array[i];
					mode = i - 4000;
					check = true;
					
				} else if (modeMax == array[i] && check == true) {
					mode = i - 4000;
					check = false;
				}
			}
		}
		
		System.out.println((int)Math.round((double)sum/n));
		System.out.println(median);
		System.out.println(mode);
		System.out.println(max-min);

		br.close();
	}
}
