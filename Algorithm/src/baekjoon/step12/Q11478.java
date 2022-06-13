package baekjoon.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Q11478 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		Set<String> set = new HashSet<String>();
		
		int gap = 1;
		int beginIndex = 0;
		
		while (beginIndex + gap <= s.length()) {
			int endIndex = beginIndex + gap;
			
			String text = s.substring(beginIndex, endIndex);
			
			set.add(text);
			
			beginIndex++;
			
			if (endIndex == s.length()) {
				beginIndex = 0;
				gap++;
			}
		}
		
		System.out.println(set.size());
		
		br.close();
	}
}
