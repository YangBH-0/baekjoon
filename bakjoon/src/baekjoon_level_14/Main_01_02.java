package baekjoon_level_14;
import java.util.*;
import java.io.*;
public class Main_01_02 {
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
		String s[];
		int n;
		try {
			n = Integer.parseInt(br.readLine());
			int numarr[]=new int[n];
			int temp[]=new int[n];
			s=new String[n];
			for(int i=0;i<n;i++) {
				numarr[i]=Integer.parseInt(br.readLine());
			}
			temp=numarr.clone();
			Arrays.sort(numarr);
			int statck=0;
			arr=new int[2];
			for(int i=0;i<n;i++) {
				if(numarr[i]==0 || numarr[i]==1) {
					fibonacci(numarr[i]);
				}else if(i!=0 && numarr[i-1]==numarr[i]) {
					
				}
				else if(i>1){
					fibonacci(numarr[i]-numarr[i-1]);
				}else {
					arr=new int[2];
					fibonacci(numarr[i]);
				}
				s[i]=""+arr[0]+" "+arr[1];
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(numarr[j]==temp[i]) {
						System.out.println(s[j]);
						break;
					}
				}
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}