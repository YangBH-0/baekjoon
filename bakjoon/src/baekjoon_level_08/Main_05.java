package baekjoon_level_08;

import java.util.Scanner;
public class Main_05 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int h,w,n;
		for(int i=0;i<t;i++) {
			h=sc.nextInt();
			w=sc.nextInt();
			n=sc.nextInt();
			System.out.print(n%h);
			if(n/h<10) {
				System.out.println("0"+(n/h+1));
			}else
				System.out.println((n/h+1));
		}
	}
}
