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
			int ho=n/h+1;
			int floor=n%h;
			if(floor==0) {
				floor=h;
				ho--;
			}
			if(ho<10) {
				System.out.println(floor+"0"+ho);
			}else
				System.out.println(floor+""+ho);
		}
	}
}
