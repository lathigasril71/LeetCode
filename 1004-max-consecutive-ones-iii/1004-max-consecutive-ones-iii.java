class Solution {
    public int longestOnes(int[] nums, int k) {
    int maxlen=0,len=0;
    int l=0,r=0;
    int zc=0;
    while(r < nums.length)
    {
        if(nums[r] == 0)
        {
            if(zc < k)
            {
                zc++;
                len= r - l +1;
                r++;
            }
            else
            {
                while(zc == k)
                {
                    if(nums[l] == 0)
                    zc--;
                    l++;
                }
            }
        }
        else{
            len = r-l+1;
            r++;
        }
        
    maxlen = Math.max(maxlen,len);
    }
    return maxlen;    
    }
}