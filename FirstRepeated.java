package set1;
import java.util.Scanner;
public class FirstRepeated {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),t=0,f=0;
		int[] ar=new int[n];
		kk:
		for(int i=0;i<n;i++) {
			ar[i]=in.nextInt();
			for(int j=0;j<=i;j++) {
				if(i!=j)
				if(ar[i]==ar[j])
					{t=ar[i];f=1;break kk;}
				else {f=0;continue;}
			}
		}
		if(f==0) System.out.println("Unique");
		else
			System.out.print(t); 
	}
}
