package baekjoon_level_03;

import java.util.Scanner;
public class Main_03 {
	public static void main(String[] args) {
		int n=new Scanner(System.in).nextInt(),sum=0;
		for(int i=1;i<=n;i++)
			sum+=i;
		System.out.println(sum);
	}

}
