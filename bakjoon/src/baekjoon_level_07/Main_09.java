package baekjoon_level_07;

import java.io.*;
public class Main_09 {
	public static void main(String[]args) {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		char[] arr;
		try {
		arr=br.readLine().toCharArray();
		br.close();
		int n=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='d') {
				if(i+1<arr.length && arr[i+1]=='z') {
					if(i+2<arr.length && arr[i+2]=='=') 
						i+=2;
				}else if(i+1<arr.length&& arr[i+1]=='-') 
					i++;
			}else if(arr[i]=='c') {
				if(i+1<arr.length&& arr[i+1]=='=')
					i++;
				else if(i+1<arr.length&& arr[i+1]=='-')
					i++;
			}else if(arr[i]=='l') {
				if(i+1<arr.length && arr[i+1]=='j')
					i++;
			}else if(arr[i]=='n') {
				if(i+1<arr.length && arr[i+1]=='j')
					i++;
			}else if(arr[i]=='s') {
				if(i+1<arr.length && arr[i+1]=='=')
					i++;
			}else if(arr[i]=='z') {
				if(i+1<arr.length && arr[i+1]=='=')
					i++;
			}
			n++;
		}
		System.out.println(n);
		}catch(IOException e) {
		}
		
	}
}
