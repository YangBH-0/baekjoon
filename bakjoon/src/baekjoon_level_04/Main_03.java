package baekjoon_level_04;

import java.util.Scanner;
public class Main_03 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),c=0,temp;
		temp=n;
		while(true) {
			if(temp<10) {
				temp=(temp*10+temp);
			}else {
				temp=(((temp%10)*10)+(((temp/10)+temp%10)%10));
			}
			c++;
			if(temp==n)
				break;
		}
		System.out.println(c);
	}
}
