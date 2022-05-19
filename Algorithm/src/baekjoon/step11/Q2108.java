package baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] array = new int[n];
		int sum = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(br.readLine());
			sum += array[i];
			max = Math.max(max, array[i]);
		}
		
		Arrays.sort(array);
		
		int[] cnt = new int[array.length];
		int cntMax = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] == array[j]) {
					cnt[i]++;
				}
			}
			cntMax = Math.max(cntMax, cnt[i]);
		}
		System.out.println("array : " + Arrays.toString(array));
		System.out.println("cnt : " + Arrays.toString(cnt));
		
		
		for (int i = 0; i < array.length; i++) {
			if (cnt[i] == cntMax) {
				System.out.println("frequency : " + array[i]);
			}
		}
		
		
		/*
		 * StringBuilder sb = new StringBuilder(); //산술평균
		 * sb.append(Math.round(sum/array.length) + "\n"); //중앙값 Arrays.sort(array);
		 * sb.append(array[array.length/2] + "\n"); //최빈값. 여러 개일 경우, 두번 째로 작은 값
		 * 
		 * 
		 * 
		 * System.out.println(sb);
		 */
	}
}
