package prosto;

import java.util.Arrays;
import java.util.Scanner;

public class InitArray {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int n;
		n=cin.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=cin.nextInt();
		
		Arrays.sort(a, 0, n-1, (t1,t2)->{return t2-t1;});
		
		//Arrays.sort(a,(val1,val2)=>val2-val1); 123 124
		System.out.println(Arrays.binarySearch(a, 2)>=0);
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		
		
	}
}
