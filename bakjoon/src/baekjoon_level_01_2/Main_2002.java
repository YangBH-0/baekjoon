package baekjoon_level_01_2;

import java.util.Scanner;
public class Main_2002 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		if(n1<60)
			System.out.print("F");
		else if(n1<70)
			System.out.print("D");
		else if(n1<80)
			System.out.print("C");
		else if(n1<90)
			System.out.print("B");
		else
			System.out.print("A");
	}
}
