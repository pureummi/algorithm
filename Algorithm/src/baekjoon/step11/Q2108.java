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
		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(br.readLine());
			sum += array[i];
		}

		Arrays.sort(array);

		int frequency = 0;
		if (n > 1) {
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
			//System.out.println("cnt : " + Arrays.toString(cnt));
			
			int cntCheck = 0;
			for (int i = 0; i < array.length; i++) {
				if (cnt[i] == cntMax) {
					cntCheck++;
				}
			}
			//System.out.println("cntCheck : " + cntCheck);
			if (cntCheck > 0) {
				int[] cntResult = new int[cntCheck];
				for (int i = 0; i < array.length; i++) {
					
					if (cnt[i] == cntMax) {
						cntResult[cntCheck-1] = array[i];
						cntCheck--;
					}
				}
				//System.out.println("cntResult : " + Arrays.toString(cntResult));
				
				if (cntResult.length-2 >= 0) {
					frequency = cntResult[cntResult.length-2];
				
				} else {
					frequency = cntResult[0];
				}
			}
		
		} else if (n == 1) {
			frequency = array[array.length-1];
		}
		
		int avg = 0;
		if ((sum % array.length) != 0) {
			if (((sum % array.length) * 10)/array.length >= 5) {
				if (sum > 0) {
					avg = sum/array.length + 1;
			
				} else {
					avg = sum/array.length - 1;
				}
			
			} else {
				avg = sum/array.length;
			}
			
		} else {
			avg = sum/array.length;
		}

		System.out.println("(sum % array.length) * 10 : " + ((sum % array.length) * 10));
		StringBuilder sb = new StringBuilder(); 
		//������
		sb.append(avg + "\n"); 
		//�߾Ӱ� Arrays.sort(array);
		sb.append(array[array.length/2] + "\n"); 
		//�ֺ�. ���� ���� ���, �ι� °�� ���� ��
		sb.append(frequency + "\n");
		//����. �ִ񰪰� �ּڰ��� ����
		sb.append(array[array.length-1]-array[0]);
		
		System.out.println(sb);
		
		br.close();
	}
}
