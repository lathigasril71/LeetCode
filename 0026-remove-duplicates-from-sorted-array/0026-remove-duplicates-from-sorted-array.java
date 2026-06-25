class Solution {
    public int removeDuplicates(int[] nums) {
        int p1= nums[0];
        int p2= 1;
       for(int i=1;i<nums.length;i++)
       {
            if(nums[i] != p1)
            {
                nums[p2] = nums[i];
                p1 = nums[i];
                p2++;
            }
       }
       return p2;
    }
}