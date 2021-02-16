package baekjoon_level_07;

import java.util.Scanner;
public class Main_08 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int result=0;
		for(int i=0;i<s.length();i++) {
			int num=s.charAt(i);
			if(num<68)
				result+=3;
			else if(num<71)
				result+=4;
			else if(num<74)
				result+=5;
			else if(num<77)
				result+=6;
			else if(num<80)
				result+=7;
			else if(num<84)
				result+=8;
			else if(num<87)
				result+=9;
			else
				result+=10;
		}
		System.out.print(result);
	}
}
