package baekjoon_level_13;
import java.util.Scanner;
 
public class test {
 
	public static int[][] arr = new int[9][9];
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = in.nextInt();
			}
		}
 
		sudoku(0, 0);
 
	}
 
	public static void sudoku(int row, int col) {
 
		// �ش� ���� �� ä������ ��� ���� ���� ù ��° ������ ����
		if (col == 9) {
			sudoku(row + 1, 0);
			return;
		}
 
		// ��� ���� ��� ä������ ��� ��� �� ����
		if (row == 9) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
 
			// ��� �� �ý����� �����Ѵ�.
			System.exit(0);
		}
 
		// ���� �ش� ��ġ�� 0 �̶�� 1���� 9���� �� ������ �� Ž��
		if (arr[row][col] == 0) {
			for (int i = 1; i <= 9; i++) {
				// i ���� �ߺ����� �ʴ��� �˻�
				if (possibility(row, col, i)) {
					arr[row][col] = i;
					sudoku(row, col + 1);
				}
			}
			arr[row][col] = 0;
			return;
		}
 
		sudoku(row, col + 1);
 
	}
 
	public static boolean possibility(int row, int col, int value) {
 
		// ���� �࿡ �ִ� ���ҵ� �� ��ġ�� �� ���Ұ� �ִ��� �˻�
		for (int i = 0; i < 9; i++) {
			if (arr[row][i] == value) {
				return false;
			}
		}
 
		// ���� ���� �ִ� ���ҵ� �� ��ġ�� �� ���Ұ� �ִ��� �˻�
		for (int i = 0; i < 9; i++) {
			if (arr[i][col] == value) {
				return false;
			}
		}
 
		// 3*3 ĭ�� �ߺ��Ǵ� ���Ұ� �ִ��� �˻�
		int set_row = (row / 3) * 3; // value�� ���� 3x3�� ���� ù ��ġ
		int set_col = (col / 3) * 3; // value�� ���� 3x3�� ���� ù ��ġ
 
		for (int i = set_row; i < set_row + 3; i++) {
			for (int j = set_col; j < set_col + 3; j++) {
				if (arr[i][j] == value) {
					return false;
				}
			}
		}
 
		return true; // �ߺ��Ǵ� ���� ���� ��� true ��ȯ
	}
 
}