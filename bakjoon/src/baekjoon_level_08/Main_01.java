package baekjoon_level_08;

import java.util.Scanner;
public class Main_01 {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		if(b-c>0) {
			System.out.print(-1);
		}else {
			int gap=b-c,BEP=0;
			while(a>0) {
				a-=gap;
				BEP++;
			}
			System.out.print(BEP);
		}
	}
}
