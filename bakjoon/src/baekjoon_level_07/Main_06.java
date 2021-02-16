package baekjoon_level_07;

import java.util.Scanner;
public class Main_06 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] arr=s.split(" ");
		int n=0;
		for(int i=0;i<arr.length;i++)
			if(!arr[i].equals(""))
				n++;
		System.out.println(n);
	}
}
