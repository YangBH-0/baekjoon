package baekjoon_level_09;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
public class Main_04 {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int m=sc.nextInt(),n=sc.nextInt();
		int[] arr=new int[n-m+1];
		int temp=m;
		for(int i=0;i<arr.length;i++) {
			arr[i]=temp++;
		}
		double squrt_n=Math.sqrt(n);
		int i=2;
		while(i<=squrt_n) {
			
			for(int j=0;j<arr.length;j++)
				if(arr[j]%i==0)
					arr[j]=0;
			i++;
		}
		for(int j=0;j<arr.length;j++) {
			if(arr[i]!=0) {
				try {
					bw.write(arr[i]+"\n");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
