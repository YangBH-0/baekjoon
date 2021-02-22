package baekjoon_level_12;

import java.util.*;
public class Main_06 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int [n][2];
		for(int i=0;i<n;i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}
		int temp;
		Arrays.sort(arr,new Comparator<int[]>(){
			@Override
			public int compare(int[] o1,int[] o2) {
				if(o1[0]==o2[0]) {
					return o1[1]-o2[1];
				}else {
					return o1[0]-o2[0];
				}
			}
		});
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i][0]!=arr[j][0]) {
					i=j-1;
					break;
				}else if(arr[i][1]>arr[j][1]) {
					temp=arr[i][0];
					arr[i][0]=arr[j][0];
					arr[j][0]=temp;
					temp=arr[i][1];
					arr[i][1]=arr[j][1];
					arr[j][1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
	}
}
