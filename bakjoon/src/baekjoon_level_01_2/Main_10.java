package baekjoon_level_01_2;

import java.util.Scanner;

public class Main_10 {
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		int n1,n2,n3;
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		System.out.println((n1+n2)%n3);
		System.out.println(((n1%n3)+(n2%n3))%n3);
		System.out.println((n1*n2)%n3);
		System.out.print(((n1%n3)*(n2%n3))%n3);
	}
}
