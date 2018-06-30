package set1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class MatchIndex {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] ar=new int[n];
		LinkedList<Integer> ll=new LinkedList<Integer>();
		for(int i=0;i<n;i++) {
			ar[i]=in.nextInt();
			if(ar[i]==i)
			ll.add(ar[i]);
		}
		Collections.sort(ll);
		if(ll.size()==0) System.out.println("-1");
		else
		for (int i=0;i<ll.size();i++) {
			System.out.print(ll.get(i)+" "); 	
		}
	}
}
