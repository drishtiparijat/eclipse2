package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int a[] = {2 , 5, 4 ,7 ,-3 , -5 };
		int n = a.length;
		for(int i = 0 ; i<n-1 ; i++) {
			
			int minind = i;
			for(int j=i ; j< n ; j++) {
				if(a[j] < a[minind]) minind = j;
			}
			int temp = a[i];
			a[i] = a[minind];
			a[minind] = temp;
			
		}
		for(int x : a) {
			System.out.print(x +" ");
		}

	}

}
