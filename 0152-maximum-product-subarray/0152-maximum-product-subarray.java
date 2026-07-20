class Solution {
    public int maxProduct(int[] nums) {
    int prod = 1;
    int max_n = Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++)
    {
        prod *= nums[i];
        max_n = Math.max(prod, max_n);
        if(prod == 0)
        prod = 1;
    } 

    prod = 1;
    for(int i=nums.length-1;i>=0;i--)
    {
        prod *= nums[i];
        max_n = Math.max(prod, max_n);
        if(prod == 0)
        prod = 1;
    } 
    return max_n;
    }
}