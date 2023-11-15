
// I have an array 

// let arr=[1,2,2,1]

// target=1 
    
// count best pair which Absolute diffence is equal to target 

// In above input output will be 4  why reason below : 

// Explaination :) 
    
//      [1,2,2,1]  ( first two element 1,2)
//      [1,2,2,1]  (first and third element 1,2)
//      [1,2,2,1]   (second and fourth element )
//      [1,2,2,1]   ( third and last element )
    
//     so count of abs diff is 4 so result will be 4 

// I guess things are clear !! 


class Solution {
    public int countTargetBestPairs(int[] nums, int k) {
        
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(Math.abs(nums[j]-nums[i])==k)
                {
                    c++;
                }
            }
        }
        return c;
    }
}




