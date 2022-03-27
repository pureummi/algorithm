package baekjoonStep4;

import java.io.IOException;
import java.util.Scanner;

public class Q1546 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);		
		int count = sc.nextInt();
		double[] array = new double[count];
		double max = 0;
		for (int i = 0; i < count; i++) {
			array[i] = sc.nextInt();
			if (max < array[i]) {
				max = array[i];
			}
		}
		sc.close();
		
		for (int j = 0; j < array.length; j++) {
			array[j] = (array[j]/max) * 100;
		}
		
		double sum = 0;
		for (int k = 0; k < array.length; k++) {
			sum += array[k]; 
		}
		
		System.out.println(sum/array.length);
	}
}
