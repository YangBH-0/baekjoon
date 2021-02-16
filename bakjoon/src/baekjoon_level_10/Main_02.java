package baekjoon_level_10;

import java.util.Scanner;
public class Main_02 {
	public static long Fibonacci(int n) {
		if(n==1)
			return 1;
		else if(n==0)
			return 0;
		return Fibonacci(n-1)+Fibonacci(n-2);
	}
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println(Fibonacci(sc.nextInt()));
	}
}
