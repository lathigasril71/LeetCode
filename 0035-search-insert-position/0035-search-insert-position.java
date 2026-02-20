class Solution {
    public int searchInsert(int[] nums, int target) {
        int f = bin_search(0,nums.length-1,target,nums);
        return f;
    }
    int bin_search(int start,int end,int target,int[] nums)
    {   
        if (start > end) 
        return start;
        int mid = (start+end)/2;
        if (target == nums[mid])
        return mid;
        else if (target < nums[mid] )
        return bin_search(start,mid-1,target,nums);
        else
        return bin_search(mid+1,end,target,nums);
    }
}