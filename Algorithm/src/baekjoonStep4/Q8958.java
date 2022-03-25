package baekjoonStep5;

import java.util.Scanner;

public class Q8958 {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);

		String[] array = new String[sc.nextInt()];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.next();
		}
		sc.close();
		
		for (int j = 0; j < array.length; j++) {
			int count = 0;
			int sum = 0;
			
			for (int k = 0; k < array[j].length(); k++) {
				if (array[j].charAt(k) == 'O') {
					count++;
				}else {
					count = 0;
				}
				sum += count;
			}
			
			System.out.println(sum);
		}
	
	}
}
