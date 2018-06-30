package set1;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class NonRep {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),f=0;
		int[] ar=new int[n];
		TreeSet<Integer> tl=new TreeSet<Integer>();
		for(int i=0;i<n;i++) {
			ar[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			f=0;
			for(int j=0;j<n;j++) {
				if(i!=j)
				if(ar[i]==ar[j]) {
				f=1;break;}
				else f=0;
			}
			if(f==0) tl.add(ar[i]);
		}
		LinkedList<Integer> ll=new LinkedList<Integer>(tl);
		if(ll.size()==0) System.out.println("Unique");
		else
		for (int i = 0; i < tl.size(); i++) {
			System.out.print(ll.get(i)+" "); 	
		}
	}
}
