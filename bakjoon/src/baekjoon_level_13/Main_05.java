package baekjoon_level_13;

import java.util.Scanner;
public class Main_05 {
	public static int backtracking(boolean [][]grid ,int row) {
		if (row ==grid.length) {
			return 1;
		}
		int n=0;
		for(int i=0;i<grid.length;i++) {
			if(isVaild(grid,row,i)) {
				grid[i][row]=true;
				n+=backtracking(grid,row+1);
				grid[i][row]=false;
			}
		}
		return n;
	}
	static boolean isVaild(boolean [][]grid,int x, int y) {
		int diff=0;
		for(int i=x-1;i>=0;i--) {
			diff++;
			if(grid[y][i]||(y-diff>=0&&grid[y-diff][i]||(y+diff<grid.length)&&grid[y+diff][i])) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean [][]grid=new boolean[n][n];
		System.out.println(backtracking(grid,0));
	}
}
