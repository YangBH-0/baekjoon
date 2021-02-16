package baekjoon_level_08;

import java.util.Scanner;
public class Main_09 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt(),x,y,k,b_k;
		for(int i=0;i<t;i++) {
			x=sc.nextInt();
			y=sc.nextInt()-1;
			k=0;
			b_k=0;
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
					System.out.println(k+" "+b_k);
					k+=b_k+2;
					break;
				}
			}
			System.out.println(k);
		}
	}
}
