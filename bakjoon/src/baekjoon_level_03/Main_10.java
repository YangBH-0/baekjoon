package baekjoon_level_03;

import java.util.Scanner;
public class Main_10 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),x=sc.nextInt(),a;
		for(int i=0;i<n;i++) {
			a=sc.nextInt();
			if(a<x)
				System.out.print(a+" ");
		}
	}
}
