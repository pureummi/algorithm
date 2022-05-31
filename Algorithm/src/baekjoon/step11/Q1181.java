package baekjoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q1181 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String[] array = new String[n];
		for (int i = 0; i < n; i++) {
			array[i] = br.readLine();
		}

		for (int i = 1; i < n; i++) {
			int targetL = array[i].length();
			String target = array[i];
			int j = i-1;

			while (j >= 0 && array[j].length() > targetL) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = target;
		}
		System.out.println("array : " + Arrays.toString(array));
		
		List<String> list = new ArrayList<String>();
		
 		for (String s : array) {
			if (!list.contains(s)) list.add(s);
		}

 		String[] result = new String[list.size()];
 		for (int i = 0; i < list.size(); i++) {
 			result[i] = list.get(i);
 		}
 		System.out.println("result : " + Arrays.toString(result));
 		
		for (int i = 1; i < result.length; i++) {
			int targetL = result[i].length();
			String target = result[i];
			int j = i-1;

			int idx = 0;
			while (j >= 0 && result[j].length() == targetL) {
				int alphabetT = target.charAt(idx) - '0';
				int alphabetJ = result[j].charAt(idx) - '0';

				if (alphabetJ > alphabetT) {
					
					result[j+1] = result[j];
					j--;
					
				} else if (alphabetJ == alphabetT) {
					System.out.println("idx : " + idx + "\n"
							+ "result[j].charAt(idx) : " + result[j].charAt(idx)
							+ ", alphabetJ : " + alphabetJ
							+ ", target.charAt(idx) : " + target.charAt(idx)
							+ ", alphabetT : " + alphabetT);

					idx++;
				} 

			}

			result[j+1] = target;
		}

		System.out.println("result : " + Arrays.toString(result));
		//
		//		StringBuilder sb = new StringBuilder();
		//		for (int i = 0; i < n; i++) {
		//			sb.append(array[i]).append('\n');
		//		}
		//		
		//		System.out.println(sb);

		br.close();
	}
}
