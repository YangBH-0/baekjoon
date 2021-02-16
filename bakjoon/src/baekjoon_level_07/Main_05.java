package baekjoon_level_07;

import java.util.Scanner;
public class Main_05 {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		int[] arr=new int[26];
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)-97<0) {
				arr[s.charAt(i)-65]++;
			}else
				arr[s.charAt(i)-97]++;
		}
		int big=0;
		for(int a:arr) {
			if(a>big)
				big=a;
		}
		int n=0;
		for(int a:arr)
			if(big==a)
				n++;
		if(n>1){
			System.out.println("?");
		}else {
			for(int i=0;i<arr.length;i++)
				if(big==arr[i])
					System.out.println((char)(i+65));
		}
	}
}
