package baekjoon_level_13;

import java.util.*;

public class Main_02 {
	static int n, m;
	static boolean check[];

	public static void backtracking(int row, int k, String s) {
		if (row == m) {
			System.out.println(s);
		} else {
			for (int i = 1; i <= n; i++) {
				if (k<=i && check[i] == false) {
					check[i] = true;
					backtracking(row + 1, i, s + i + " ");
					check[i] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		check = new boolean[n+1];
		backtracking(0, 0, "");
	}
}
