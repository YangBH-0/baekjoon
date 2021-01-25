package baekjoon_level_05;

import java.util.Scanner;
public class Main_05 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=1;i<n;i++) {
			if(max<arr[i])
				max=arr[i];
		}
		float sum=0;
		for(int i=0;i<n;i++) {
			sum+=(arr[i]/(float)max)*100;
		}
		System.out.print(sum/n);
	}
}
