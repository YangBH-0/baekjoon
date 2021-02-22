package baekjoon_level_12;

import java.util.Scanner;
public class Main_01 {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int temp;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}
}
