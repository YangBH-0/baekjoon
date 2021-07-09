package baekjoon_level_14;

import java.util.*;
import java.io.*;
public class Main_01 {
	static int arr[];
	public static int fibonacci(int n) {
		if(n==0) {
			arr[0]++;
			return 0;
		}else if(n==1) {
			arr[1]++;
			return 1;
		}else {
			return fibonacci(n-1)+ fibonacci(n-2);
		}
	}
	public static void main(String[]args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		int n;
		try {
			n = Integer.parseInt(br.readLine());
			int numarr[]=new int[n];
			for(int i=0;i<n;i++) {
				numarr[i]=Integer.parseInt(br.readLine());
			}
			Arrays.sort(numarr);
			for(int i=0;i<n;i++) {
				if(numarr[i]==0 || numarr[i]==1) {
					arr=new int[2];
					fibonacci(numarr[i]);
				}else if(i!=0 && numarr[i-1]==numarr[i]) {
					
				}
				else if(i>1){
					fibonacci(numarr[i]-numarr[i-1]);
				}else {
					arr=new int[2];
					fibonacci(numarr[i]);
				}
				sb.append(arr[0]+" "+arr[1]+"\n");
			}
			System.out.println(sb);
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
