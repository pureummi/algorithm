package baekjoon.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer str = new StringTokenizer(br.readLine());

		int x = Integer.parseInt(str.nextToken()), y = Integer.parseInt(str.nextToken());
		int w = Integer.parseInt(str.nextToken()), h = Integer.parseInt(str.nextToken());

		int gapX = w - x, gapY = h - y;

		int temp = 0;
		if (gapX > gapY) {
			temp = gapY;

		} else if (gapX < gapY) {
			temp = gapX;

		} else {//gapX == gapY
			temp = gapX;
		}

		if (temp > x) {
			temp = x;

		} else if (temp > y) {
			temp = y;
		}

		System.out.println(temp);

		br.close();
	}
}
