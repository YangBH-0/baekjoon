package baekjoon_level_04;

import java.util.Scanner;
public class Main_02 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n1;
		while(sc.hasNextInt()) {
			n1=sc.nextInt();
			System.out.println(n1+sc.nextInt());
		}
	}
}
