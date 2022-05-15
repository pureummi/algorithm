package baekjoon.step05;

public class Q4673 {
	public static void main(String[] args) {
		boolean[] check = new boolean[10000];
		
		for (int i = 0; i < check.length; i++) {
			int n = d(i);
			
			if (n < 10000) {
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < check.length; i ++) {
			if(!check[i]) {
				sb.append(i).append('\n');
			}
		}
		
		System.out.println(sb);
		
	}

	public static int d(int n) {
		int sum = n;
		while (n != 0) {
			sum = sum + (n%10);
			n = n/10;
		}
		
		return sum;
	}
}
