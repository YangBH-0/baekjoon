package baekjoon_level_13;

import java.util.Scanner;

public class Main_03 {
	static int n, m;
	static StringBuffer sb =new StringBuffer();
	public static void backtracking(int row, String s) {
		if (row == m) {
			sb.append(s.trim()+"\n");
			return;
		} else {
			for (int i = 1; i <= n; i++) {
				backtracking(row + 1, s + i + " ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		backtracking(0,"");
		System.out.print(sb);
	}
}
