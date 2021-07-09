package baekjoon_level_08;

import java.util.Scanner;
public class Main_09 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt(),x,y;
		for(int i=0;i<t;i++) {
			x=sc.nextInt();
			y=sc.nextInt();
			int distance=y-x;
			int k=distance/2;
			k=0;
			boolean f=true;
			while(true) {
				if(f) {
					x+=++k;
					f=false;
				}
				else {
					y-=++b_k;
					f=true;
				}
				if(x+(k-1)==y||x+(k)==y||x+(k+1)==y) {
					k+=b_k+2;
					break;
				}
			}
			System.out.println(k);
		}
	}
}
