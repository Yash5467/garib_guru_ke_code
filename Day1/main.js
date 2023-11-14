function getBestPair(arr){
        
    let bestPairCount=0;
    
   let n=arr.length;
 
    for(let i=0;i<n;i++)
    for(let j=0;j<n;j++)
        if(arr[i]==arr[j] && i<j)
        {
        bestPairCount++;
        }
    return bestPairCount; 
    
}