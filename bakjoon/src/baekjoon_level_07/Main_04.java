package baekjoon_level_07;

import java.util.Scanner;
public class Main_04 {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int R;
		for(int i=0;i<n;i++) {
			R=sc.nextInt();
			String s=sc.nextLine();
			s=s.substring(1);
			String p="";
			for(int j=0;j<s.length();j++)
				for(int k=0;k<R;k++)
					p+=s.charAt(j);
			System.out.println(p);
		}
	}
}
