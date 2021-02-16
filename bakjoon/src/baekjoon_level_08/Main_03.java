package baekjoon_level_08;

import java.util.Scanner;
public class Main_03 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int count=1,i=1,j=1,k=1,d=1;
		while(x>count) {
			if(d==1) {
				if(j==k) {
					j++;
					k++;
					d--;
				}else {
					i--;
					j++;
				}
			}else {
				if(i==k) {
					i++;
					k++;
					d++;
				}else {
					i++;
					j--;
				}
			}
			count++;
		}
		System.out.println(i+"/"+j);
	}
}
