package baekjoon_level_13;

import java.util.*;

public class Main_06 {
	static int[][] sudoku;

	public static void backtracking(int cnt) {
		if (cnt == 81) {
			print(sudoku);
			System.exit(0);
			return;
		}
		int x = cnt % 9;
		int y = cnt / 9;
		if (sudoku[y][x] == 0) {

			for (int i = 1; i < 10; i++) {
				if (isVaild(x, y, i)) {
					sudoku[y][x] = i;
					backtracking(cnt+1);
				}
			}
			sudoku[y][x]=0;
			return;
		}
		backtracking(cnt + 1);
	}

	public static boolean isVaild(int x, int y, int n) {
		for (int i = 0; i < 9; i++) {
			if (sudoku[i][x] == n)
				return false;
		}
		for (int i = 0; i < 9; i++) {
			if (sudoku[y][i] == n)
				return false;
		}
		for (int k = (x / 3) * 3; k < (x / 3) * 3 + 3; k++) {
			for (int l = (y / 3) * 3; l < (y / 3) * 3 + 3; l++) {
				if (sudoku[l][k] == n)
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sudoku = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				sudoku[i][j] = sc.nextInt();
			}
		}
		backtracking(0);

	}
	public static void print(int[][] arr) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {
			String s = "";
			for (int j = 0; j < arr[0].length; j++) {

				s += (arr[i][j] + " ");
			}
			s = s.trim();
			sb.append(s + "\n");
		}
		System.out.println(sb.substring(0, sb.length() - 1));
	}
}
