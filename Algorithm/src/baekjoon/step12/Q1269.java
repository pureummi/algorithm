package baekjoon.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Q1269 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		int[] a = new int[Integer.parseInt(str.nextToken())];
		int[] b = new int[Integer.parseInt(str.nextToken())];
		
		Set<Integer> setA = new HashSet<Integer>();
		
		str = new StringTokenizer(br.readLine());
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(str.nextToken());
			setA.add(a[i]);
		}
		
		Set<Integer> setB = new HashSet<Integer>();
		
		str = new StringTokenizer(br.readLine());
		for (int i = 0; i < b.length; i++) {
			b[i] = Integer.parseInt(str.nextToken());
			setB.add(b[i]);
			
			if (setA.contains(b[i])) {
				setA.remove(b[i]);
			}
		}
		
		for (int i : a) {
			if (setB.contains(i)) {
				setB.remove(i);
			}
		}
		
		System.out.println(setA.size() + setB.size());
		
		br.close();
	}
}
