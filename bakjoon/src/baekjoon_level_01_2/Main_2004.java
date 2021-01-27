package baekjoon_level_01_2;

import java.util.Scanner;
public class Main_2004 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt(), n2=sc.nextInt();
		if(n1>0&&n2>0)
			System.out.print("1");
		else if(n1<0&&n2>0)
			System.out.print("2");
		else if(n1<0&&n2<0)
			System.out.print("3");
		else
			System.out.print("4");
	}
}
