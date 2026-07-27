class Solution {
    public int maxScore(int[] cardPoints, int k) {
    int sum=0;    
    if(k == cardPoints.length)
    {
        for(int i=0;i<cardPoints.length;i++)
        sum += cardPoints[i];

        return sum;
    } 
    int lsum=0, rsum=0;
    int l=0, r=cardPoints.length-1;
    while(l<k)
    {
    lsum += cardPoints[l];
    l++;
    }
    int maxsum=lsum;
    for(l=k-1;l>=0;l--)
    {
        lsum -= cardPoints[l];
        rsum += cardPoints[r];
        r--;
        maxsum = Math.max(maxsum, lsum+rsum);
    }
    return maxsum;
    }
}