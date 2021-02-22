package baekjoon_level_11;

import java.util.Scanner;
public class Main_03 {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][2];
		int rank[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==i)
					continue;
				else {
					if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) {
						rank[i]++;
					}
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(rank[i]+1+" ");
		}
	}
}
