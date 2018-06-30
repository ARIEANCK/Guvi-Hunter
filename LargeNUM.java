package set1;

import java.util.*;

public class LargeNUM {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		LinkedList<Integer> ll=new LinkedList<Integer>();
		for(int i=0;i<n;i++) {
					ll.add(in.nextInt());
		}
		Collections.sort(ll);
		for (int i = ll.size()-1; i >=0; i--) {
			System.out.print(ll.get(i)); 	
		}
	}

}
