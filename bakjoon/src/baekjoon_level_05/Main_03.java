package baekjoon_level_05;

import java.util.Scanner;
public class Main_03 {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
		int result=a*b*c,temp,i=10;
		
		int[] arr=new int[10];
		while(result>0) {
			temp=result%i;
			temp=temp/(i/10);
			result-=result%i;
			i*=10;
			arr[temp]++;
		}
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
