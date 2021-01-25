package baekjoon_level_05;

import java.util.Scanner;
public class Main_07 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),sum,count;
		int[] arr;
		double aver;
		for(int i=0;i<n;i++) {
			sum=0;
			count=0;
			arr=new int[sc.nextInt()];
			for(int j=0;j<arr.length;j++) {
				arr[j]=sc.nextInt();
				sum+=arr[j];
			}
			aver=sum/(double)arr.length;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>aver)
					count++;
			}
			String s=String.format("%.3f",count/(double)arr.length*100);
			System.out.println(s+"%");
		}
	}
}
