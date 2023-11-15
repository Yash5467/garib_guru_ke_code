
// Day 1 
// -- --- ---- ---- 
// I have an Array 

// let arr= [1,3,4,5,1,3]

// find all Best Pairs 

// A pair (i,j) is called Best if arr[i]==arr[j]  & i <j 

// in this case output will be : 2 

// Explaination :)   (0,4) and (1,5)

// I hope samajh gye honge !!
import java.util.*;
public class Main
{
    public static int getBestPair(int arr[]){
        
        int bestPairCount=0;
        
       int n=arr.length;
     
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
            if(arr[i]==arr[j] && i<j)
            {
            bestPairCount++;
            }
        return bestPairCount; 
        
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	   
	     int n=sc.nextInt();
	     
	     int arr[]=new int[n];
	     
	     for(int i=0;i<n;i++){
	         arr[i]=sc.nextInt();
	     }
	     
	     System.out.println(getBestPair(arr));
	     
	}
}
