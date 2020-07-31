package arrays;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int k = sc.nextInt();
        for(int i=0 ; i< n ; i++) {
        	arr[i] = sc.nextInt();
        }
        int result = Solve(k , arr);
        System.out.println(result);
    }
    static int Solve(int k, int[] arr){
        int n = arr.length;
        for(int i =0 ; i<n ; i++){
            int j =0;
            if(arr[i] < 0){
                continue;
            }
            while( arr[i]!=0){
                if((j>= i-k && j<= i+k) && (arr[j]<0)){
                    int p = Math.min(Math.abs(arr[j]) ,arr[i]);
                    arr[i] = arr[i] - p;
                    arr[j] = arr[j] + p;
                    if ( arr[i]== 0){
                        break;
                    }
                }
                else{
                    j++;
                    continue;
                }


            }
            
        }
        int sum = 0 ;
        for(int i=0 ; i<n ; i++){
            sum+= Math.abs(arr[i]);
        }
        return sum;

    
    }
}
