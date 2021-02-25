package baekjoon_level_13;

import java.util.Scanner;
public class Main_07 {
	static int []arr;
	static int []oper=new int[4];
	static int max,min;
	public static void backtracking(int row,int num) {
		if(row==arr.length) {
			if(num>max)
				max=num;
			if(min>num)
				min=num;
			return;
		}
		for(int i=0;i<4;i++) {
			if(oper[i]!=0) {
				switch(i) {
				case(0):{
					oper[0]--;
					backtracking(row+1,num+arr[row]);
					oper[0]++;
				}case(1):{
					oper[1]--;
					backtracking(row+1,num-arr[row]);
					oper[1]++;
				}case(2):{
					oper[2]--;
					backtracking(row+1,num*arr[row]);
					oper[2]++;
				}case(3):{
					oper[3]--;
					backtracking(row+1,num/arr[row]);
					oper[3]++;
				}
				}
			}
		}
		return;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		arr=new int[n];
		max=Integer.MIN_VALUE;
		min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<4;i++) {
			oper[i]=sc.nextInt();
		}
		backtracking(1,arr[0]);
		System.out.println(max);
		System.out.println(min);
	}
}
