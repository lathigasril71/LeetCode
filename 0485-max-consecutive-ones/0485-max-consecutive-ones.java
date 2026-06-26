class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    int i=0;
    int n = nums.length;
    int count =0;
    int count_temp = 0;
    while(i < n)
    {
        if(nums[i] == 1)
        {
        count++;
        count_temp = Math.max(count_temp,count);
        }
        else
        count = 0;

        i++;
    }
    
    return count_temp;
    }
}