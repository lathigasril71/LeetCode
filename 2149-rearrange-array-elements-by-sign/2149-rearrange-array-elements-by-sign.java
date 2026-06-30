class Solution {
    public int[] rearrangeArray(int[] nums) {
       int ans[] = new int[nums.length];
        int pos = 0,neg = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] > 0)
            {
                ans[2*pos] = nums[i];
                pos++;
            }
            else
            {
                ans[2*neg+1] = nums[i];
                neg++;
            }
        }
       return ans;
    }
}