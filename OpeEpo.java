package set1;

import java.util.Scanner;

public class OpeEpo {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String s="";
		int[] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=in.nextInt();
				if(ar[i]%2==0 && i%2!=0) {
					s+=""+ar[i]+" ";
					}
				if(ar[i]%2!=0 && i%2==0) {
					s+=""+ar[i]+" ";
					}
		}
		System.out.println(s);
	}
}
