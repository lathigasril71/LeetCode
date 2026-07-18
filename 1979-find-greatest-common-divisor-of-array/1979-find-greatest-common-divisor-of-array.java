class Solution {
    public int findGCD(int[] nums) {
    int min_n = Integer.MAX_VALUE;
    int max_n = Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i] > max_n)
        max_n = nums[i];

        if(min_n > nums[i])
        min_n = nums[i];
    }  
    while(min_n != 0)
    {
        int temp = min_n;
        min_n = max_n % min_n;
        max_n = temp;
    }  

    return max_n;
    }
}