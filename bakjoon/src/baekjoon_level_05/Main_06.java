package baekjoon_level_05;

import java.util.Scanner;
public class Main_06 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),w=1,sum;
		sc.nextLine();
		String[] s=new String[n];
		for(int i=0;i<n;i++) {
			s[i]=sc.nextLine();
		}
		for(int i=0;i<s.length;i++) {
			sum=0;
			w=1;
			for(int j=0;j<s[i].length();j++) {
				if(s[i].charAt(j)=='O') {
					sum+=w++;
				}else
					w=1;
			}
			System.out.println(sum);
		}
	}
}
