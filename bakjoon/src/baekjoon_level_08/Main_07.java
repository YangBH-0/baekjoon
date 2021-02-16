package baekjoon_level_08;

import java.util.Scanner;
public class Main_07 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),temp;
		int result=-1,min=5000;
		for(int i=0;i<=n/5;i++) {
			temp=n-(i*5);
			if(temp%3==0 && min>(i+(temp/3)))
				min=i+(temp/3);
		}
		if(min!=5000)
			result=min;
		System.out.print(result);
	}
}
