package baekjoon_level_07;

import java.util.Scanner;
public class Main_02 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		sc.nextLine();
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			sum+=s.charAt(i)-48;
		}
		System.out.print(sum);
	}
}
