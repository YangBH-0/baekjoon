package baekjoon_level_15;

import java.util.Scanner;

public class Main_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int money = sc.nextInt();
		int coin[] = new int[n];
		for(int i=0;i<n;i++) {
			coin[i]=sc.nextInt();
		}
		int index=n;
		int result=0;
		while(money>0) {
			result+=money/coin[--index];
			money%=coin[index];
		}
		System.out.println(result);
	}
}
