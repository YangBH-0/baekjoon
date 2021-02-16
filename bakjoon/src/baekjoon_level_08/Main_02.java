package baekjoon_level_08;

import java.util.Scanner;
public class Main_02 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int i=1,k=0;
		while(true) {
			i+=(k*6);
			if(i>=n)
				break;
			k++;
		}
		System.out.print(k+1);
	}
}
