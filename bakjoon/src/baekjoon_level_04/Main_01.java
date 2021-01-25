package baekjoon_level_04;

import java.util.Scanner;
public class Main_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		while(true) {
			n1=sc.nextInt();
			if(n1==0)
				break;
			System.out.println(n1+sc.nextInt());
		}
	}
}
