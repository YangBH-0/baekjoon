package baekjoon_level_09;

import java.util.Scanner;
public class Main_01 {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt(),result=0;
		boolean flag;
		for(int i=0;i<N;i++) {
			int num=sc.nextInt();
			float half=num/(float)2;
			flag=true;
			for(int j=2;j<=half;j++) {
				if(num%j==0) {
					flag=false;
					break;
				}
			}
			if(flag && num!=1) {
				result++;
			}
		}
		System.out.print(result);
	}
}
