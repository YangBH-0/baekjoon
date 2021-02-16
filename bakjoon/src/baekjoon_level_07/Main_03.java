package baekjoon_level_07;

import java.util.Scanner;
public class Main_03 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=97;i<123;i++)
			System.out.print(s.indexOf((char)i)+"");
	}
}
