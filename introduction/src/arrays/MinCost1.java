package arrays;
import java.util.Scanner;
public class MinCost1 {

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
				boolean transfer;
				while(a[i]!=0) {
					transfer = false ;
					for(int j = p ; j<= q ; j++) {
						 if( a[j] <0) {
							int no = Math.min(Math.abs(a[j]) ,a[i]);
							a[i] = a[i] - no;
		                    a[j] = a[j] + no;						 								 
							transfer = true;	
								 
						 }
					}
					if(!transfer) {
						break;
					}
				}
				
				
			}
		}
		long sum =0;
		for(int i=0 ; i<n ;i++) {
			sum+= Math.abs(a[i]);
		}
		System.out.println(sum);

	}

}

