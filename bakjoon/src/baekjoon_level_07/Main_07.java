package baekjoon_level_07;

import java.util.Scanner;
public class Main_07 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] arr=s.split(" ");
		int big=0;
		for(String num:arr) {
			String temp="";
			for(int i=num.length()-1;i>=0;i--) {
				temp+=num.charAt(i);
			}
			if(Integer.parseInt(temp)>big) {
				big=Integer.parseInt(temp);
			}
		}
		System.out.println(big);
	}
}
