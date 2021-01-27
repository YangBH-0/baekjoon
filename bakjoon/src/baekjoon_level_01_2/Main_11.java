package baekjoon_level_01_2;

import java.util.Scanner;

public class Main_11 {
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		int n1,n2;
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println(n1*(n2%10));
		System.out.println(n1*((n2%100)/10));
		System.out.println(n1*(n2/100));
		System.out.println(n1*n2);
	}
}
