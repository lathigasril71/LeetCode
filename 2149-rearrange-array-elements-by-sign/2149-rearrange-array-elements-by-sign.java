class Solution {
    public int[] rearrangeArray(int[] nums) {
       List<Integer> pos = new ArrayList<>();
       List<Integer> neg = new ArrayList<>();
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i] > 0)
        pos.add(nums[i]);
        else
        neg.add(nums[i]);
       } 
       int i=0;
       int c=0;
       while(i < nums.length)
       {
        nums[i++] = pos.get(c);
        nums[i++] = neg.get(c);
        c++;
       }

       return nums;
    }
}