package baekjoon_level_11;

import java.util.Scanner;
public class Main_02 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int i=1;
		int sum = 0;
		int j;
		while(i<n) {
			sum=i;
			j=i;
			while(j>0) {
				sum+=j%10;
				j/=10;
			}
			if(sum==n) {
				System.out.println(i);
				break;
			}
			i++;
		}
		if(sum!=n) {
			System.out.println(0);
		}
	}
}
