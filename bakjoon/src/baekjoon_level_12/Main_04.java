package baekjoon_level_12;

import java.io.*;
import java.util.*;

public class Main_04 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int count[]=new int[8001];
			int n = Integer.parseInt(br.readLine());
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				arr.add(Integer.parseInt(br.readLine()));
			}
			br.close();
			Collections.sort(arr);
			int sum = 0;
			// 4000~8000 => 0~4000 || 3999~0 => -1~-4000
			for (int num : arr) {
				sum += num;
				if(num>=0) {
					count[num+4000]++;
				}else {
					count[num+4000]++;
				}
			}
			int fre=0;
			for(int cnt:count) {
				if(fre<cnt)
					fre=cnt;
			}
			System.out.println(Math.round((float) sum / arr.size()));
			System.out.println(arr.get(arr.size() / 2));
			boolean flag=false;
			int index=0;
			for(int i=0;i<count.length;i++) {
				if(flag && fre==count[i]) {
					System.out.println(i-4000);
					flag=false;
					break;
				}else if (fre==count[i]) {
					flag=true;
					index=i-4000;
				}
			}
			if(flag) {
				System.out.println(index);
			}
			System.out.println(arr.get(arr.size() - 1) - arr.get(0));
		} catch (Exception e) {

		}

	}
}
