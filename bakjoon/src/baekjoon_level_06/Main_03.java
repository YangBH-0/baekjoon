package baekjoon_level_06;

import java.util.Scanner;
public class Main_03 {
	static boolean hannumber(int n) {
		int temp=n%10;
		n=n/10;
		int pregap=n%10-temp;
		int gap;
		while(n/10!=0) {
			temp=n%10;
			n=n/10;
			gap=n%10-temp;
			if(gap!=pregap) {
				return false;
			}
			pregap=gap;
		}
		return true;
	}
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(hannumber(i))
				count++;
		}
		System.out.println(count);
		sc.close();
	}
}
