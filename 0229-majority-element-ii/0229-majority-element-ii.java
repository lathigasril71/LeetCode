class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0, cnt2=0;
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(cnt1 == 0 && el2 != nums[i])
            {
                cnt1 = 1;
                el1 = nums[i];
            }
            else if(cnt2 == 0 && el1 != nums[i])
            {
                cnt2 = 1;
                el2 = nums[i];
            }
            else if(el1 == nums[i])
            cnt1++;
            else if(el2 == nums[i])
            cnt2++;
            else
            {
                cnt1--;
                cnt2--;
            }
        }

        int min = nums.length/3;
        int count1=0, count2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == el1)
            count1++;
            else if(nums[i] == el2)
            count2++;
        }
        List<Integer> list = new ArrayList<>();
        if(count1 > min)
        list.add(el1);
        if(count2 > min)
        list.add(el2);

        return list;
    }
}