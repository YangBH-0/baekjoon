package baekjoon_level_08;

import java.util.Scanner;
public class Main_01 {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		int gap=c-b;
		if(gap<=0) {
			System.out.print(-1);
		}else {
			System.out.print(a/gap+1);
		}
	}
}
