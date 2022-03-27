package baekjoonStep4;

import java.util.Scanner;


public class Q2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
	
		String result = String.valueOf(a*b*c);
		int resultArr[] = new int[result.length()];
		int array[] = new int[10];
		int count[] = new int[10];
		
		for (int i = 0; i < resultArr.length; i++) {
			resultArr[i] = Integer.parseInt(String.valueOf(result.charAt(i)));	
			
			for (int j = 0; j < array.length; j++) {
				array[j] = j;
				
				if(array[j] == resultArr[i]) {
					count[j]++;
				}
			}
		}
		
		for (int k : count) {
			System.out.println(k);
		}
	}
}
