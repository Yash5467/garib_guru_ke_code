// I have an array of number arr, and three number a, b and c. You need to find the number of best triplets.

// A triplet (arr[i], arr[j], arr[k]) is best if the following conditions are true:

// 0 <= i < j < k < arr.length
// |arr[i] - arr[j]| <= a
// |arr[j] - arr[k]| <= b
// |arr[i] - arr[k]| <= c

// Where |x| denotes the absolute value of x.

// Return the number of best triplets.
    
// let arr=  [5,0,2,1,9,3]
// a=2
// b=1
// c=4


// output will be : 2 why 2 reason below !!! 

// Explaination :)

// (1,2,3)

// (1,2,5)

// ye

import java.util.*;
public class Main
{
    public static int getBestTriplet(int arr[],int a, int b ,int c){
        
       int n =arr.length;
        int count=0;
        for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
        for(int k=j+1;k<n;k++){
            
            if(Math.abs(arr[i]-arr[j])<=a && Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c)
            {
                
                count++;                
            }
        }
        }
        }
        return count;
        
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	   
	     int n=sc.nextInt();
	     
	     int arr[]=new int[n];
	     
	     for(int i=0;i<n;i++){
	         arr[i]=sc.nextInt();
	     }
	     
	     int a=sc.nextInt();
	     int b=sc.nextInt();
	     int c=sc.nextInt();
	     
	     
	     System.out.println(getBestTriplet(arr,a,b,c));
	     
	}
}
