package arrays;
import java.util.Scanner;
public class MinCost {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for(int i =0 ; i<n ; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0 ; i< n ; i++) {
			if(a[i] > 0) {
				int p , q ;
				if(i-k <0) {
					p = 0;
				}else {
					p= i-k;
				}
				if(i+k > n-1) {
					q = n-1;
				}else {
					q = i+k;
				} 
				int min = Integer.MAX_VALUE;
				int index = 0;
				boolean transfer;
				while(a[i]!=0) {
					min = Integer.MAX_VALUE;
					index = 0;
					transfer = false ;
					for(int j = p ; j<= q ; j++) {
						 if( a[j] <0) {
							 if ( Math.abs(a[j]) < min) {
								 min = Math.abs(a[j]);
								 index = j;
								 transfer = true;
							 }
								 
						 }
					}
					if(!transfer) {
						break;
					}
					else {
						int no = Math.min(Math.abs(a[index]) ,a[i]);
						a[i] = a[i] - no;
	                    a[index] = a[index] + no;
					}
				}
				
				
			}
		}
		int sum =0;
		for(int i=0 ; i<n ;i++) {
			sum+= Math.abs(a[i]);
		}
		System.out.println(sum);

	}

}
