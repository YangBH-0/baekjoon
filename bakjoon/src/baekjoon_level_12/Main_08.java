package baekjoon_level_12;

import java.util.*;
public class Main_08 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] strarr=new String[n];
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<n;i++) {
			strarr[i]=sc.nextLine();
		}
		Arrays.sort(strarr);
		for(int i=1;i<51;i++) {
			for(int j=0;j<n;j++) {
				if(i==strarr[j].length()) {
					if(j==0)
						System.out.println(strarr[j]);
					else if(!strarr[j].equals(strarr[j-1])) {
						System.out.println(strarr[j]);
					}
				}
			}
		}
	}
}
