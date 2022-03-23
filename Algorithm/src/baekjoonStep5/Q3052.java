package baekjoonStep5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[10];
		int[] result = new int[10];
		
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
			result[i] = input[i] % 42;	
		}
		sc.close();
		
		List<Integer> arrList = new ArrayList<>();
		
		for (int n : result) {
			if (!arrList.contains(n)) {
				arrList.add(n);
			}
		}
		
		System.out.println(arrList.size());
			
	}
}
