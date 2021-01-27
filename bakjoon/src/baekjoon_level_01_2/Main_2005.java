package baekjoon_level_01_2;

import java.util.Scanner;
public class Main_2005 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt(), n2=sc.nextInt();
		if(n2>=45) {
			n2-=45;
		}else {
			n1--;
			if(n1<0)
				n1+=24;
			n2+=15;
		}
		System.out.print(n1+" "+n2);
	}
}
