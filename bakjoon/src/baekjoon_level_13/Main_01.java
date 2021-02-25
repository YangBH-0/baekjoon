package baekjoon_level_13;

import java.util.*;
public class Main_01 {
	static int [][]arr;
	static boolean check[];
	public static void backtracking(int row,String s) {
		if(row==arr.length) {
			System.out.println(s);
			return;
		}
		for(int i=0;i<arr[0].length;i++) {
			if(check[i]==false) {
				check[i]=true;
				backtracking(row+1,s+arr[row][i]+" ");
				check[i]=false;
			}
		}
		return;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		arr=new int[m][n];
		check=new boolean[n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=j+1;
			}
		}
		backtracking(0,"");
	}
}
