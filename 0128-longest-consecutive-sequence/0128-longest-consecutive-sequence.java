class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int l = 1;
        int c=0,ls=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]-1 == ls)
            {
                c++;
                ls = nums[i];
            }
            else if(nums[i] != ls)
            {
                c = 1;
                ls = nums[i];
            }
            l = Math.max(l,c);
        }
        return l;
    }
}