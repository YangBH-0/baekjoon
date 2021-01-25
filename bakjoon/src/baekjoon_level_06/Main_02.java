package baekjoon_level_06;

public class Main_02 {
	static int[] self=new int[10000];
	static int d(int n) {
		if(n<10) {
			n+=n;
		}else if(n<100) {
			n=n+n/10+n%10;
		}
		else if(n<1000){
			n=n+n/100+(n%100)/10+n%10;
		}else
			n=n+n/1000+(n%1000)/100+(n%100)/10+n%10;
		if(n>10000)
			return 0;
		self[n-1]=1;
		return n;
	}
	public static void main(String[]args) {
		for(int i=0;i<self.length;i++) {
			if(self[i]==0) {
				System.out.println(i+1);
				d(i+1);
			}else
				d(i+1);
		}
	}
}
