class Solution {
    public int majorityElement(int[] nums) {
    int el=0;    
    int cnt = 0;
    for(int i=0;i<nums.length;i++)
    {
        if(cnt == 0)
        el = nums[i];

        if(nums[i] == el)
        cnt++;
        else
        cnt--;
    }
    
    return el;
    }
}