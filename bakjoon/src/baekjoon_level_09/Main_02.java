package baekjoon_level_09;

import java.util.Scanner;
public class Main_02 {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int m=sc.nextInt(),n=sc.nextInt();
		int min=0,sum=0;
		float half;
		boolean flag=true,PMcheck;
		for(int i=m;i<=n;i++) {
			half=i/(float)2;
			PMcheck=true;
			System.out.println(half);
			for(int j=2;j<=half;j++) {
				if(i%j==0) {
					PMcheck=false;
					break;
				}
			}
			if(PMcheck) {
				sum+=i;
				if(flag) {
					min=i;
					flag=false;
				}
			}
		}
		if(flag) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
