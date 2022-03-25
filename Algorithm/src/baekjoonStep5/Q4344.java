package baekjoonStep5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Q4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
	
		StringTokenizer str;
		int[] array = {};
		int count, sum, total;
		double avg, result;
		DecimalFormat df;
		for (int i = 0; i < n; i++) {
			count = 0;
			sum = 0;
			avg = 0;
			total = 0;
			str = new StringTokenizer(br.readLine());
			count = Integer.parseInt(str.nextToken());
			array = new int[count];
			
			for(int j = 0; j <count ; j++) {
				array[j] = Integer.parseInt(str.nextToken());
				sum += array[j];
			}
				
			avg = sum/array.length;
			for(int a = 0; a < array.length; a++) {
				if(array[a]>avg) {
					total++;
				}
			}
			
			result = (double)total/(double)array.length*100;
			df = new DecimalFormat("#.000");
			bw.write(df.format(result) + "%" +"\n");
		}
		
		bw.close();
	}
}
