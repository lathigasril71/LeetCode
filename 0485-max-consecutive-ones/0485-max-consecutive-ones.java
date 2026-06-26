class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    int i=0;
    int n = nums.length;
    int count =0;
    int count_temp = 0;
    while(i < n)
    {
        if(nums[i] == 1)
        count++;
        else
        {
        if(count > count_temp)    
        count_temp = count;
        count = 0;
        }
        i++;
    }
    if(count_temp > count)
    return count_temp;
    else
    return count;
    }
}