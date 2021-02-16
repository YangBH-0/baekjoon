package baekjoon_level_10;

import java.util.Scanner;
public class Main_01 {
	public static long factorial (int n) {
		if(n<2)
			return 1;
		return n*factorial(n-1);
	}
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(factorial(sc.nextInt()));
	}
}
