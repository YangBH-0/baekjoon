package baekjoon_level_03;

import java.util.Scanner;
public class Main_08 {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt(),a,b;
		for(int i=1;i<=n;i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Case #"+i+": "+a+" + "+b+" = "+(a+b));
		}
	}
}
