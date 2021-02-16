package baekjoon_level_08;

import java.util.Scanner;
public class Main_06 {
	public static int p(int k,int n) {
		int result=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=i+1;
		for(int i=0;i<k;i++) {
			for(int j=n-1;j>0;j--) {
				for(int l=j-1;l>=0;l--) {
					arr[j]+=arr[l];
				}
			}
		}
		for(int i=0;i<n;i++) {
			result+=arr[i];
		}
		return result;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt(),k,n,sum;
		for(int i=0;i<t;i++) {
			k=sc.nextInt();
			n=sc.nextInt();
			sum=0;
			sum+=p(k-1,n);
			System.out.println(sum);
		}
	}
}
