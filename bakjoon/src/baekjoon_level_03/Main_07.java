package baekjoon_level_03;

import java.util.Scanner;
public class Main_07 {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		for(int i=1;i<=n;i++)
			System.out.println("Case #"+i+": "+(sc.nextInt()+sc.nextInt()));
	}
}