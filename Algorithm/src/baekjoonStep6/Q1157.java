package baekjoonStep6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().toLowerCase().toCharArray();
		
		List<char[]> asList = Arrays.asList(input);
		ArrayList<Character> listChar = new ArrayList<Character>();
		for (char c : input) {
			listChar.add(c);
		}
		
		Set<Character> set = new HashSet<Character>(listChar);
		
		List<Integer> resultList = new ArrayList<Integer>();
		ArrayList<Character> result = new ArrayList<Character>();
		for (char c : set) {
			resultList.add(Collections.frequency(listChar, c));
			result.add(c);
		}
		
		List<Character> output = new ArrayList<Character>();
		for (int i = 0; i < set.size(); i++) {
			for (int j = 0; j < set.size(); j++) {
				if (resultList.get(i) > resultList.get(j)) {
					output.add(result.get(i));
				} else if (set.size() == 1) {
					output.add(result.get(i));					
				}
			}
		}
		
		String realResult = output.toString();
		if (output.size() > 2) {
			System.out.println("?");
		} else if (output.size() == 1) {
			System.out.println(realResult.toUpperCase().substring(1, 2));
		}
	}
}
