package baekjoon_level_03;

import java.util.Scanner;
public class Main_02 {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) 
			System.out.println((sc.nextInt())+(sc.nextInt()));
	}
}
