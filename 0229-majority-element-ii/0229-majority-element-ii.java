class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int n : nums)
        s.add(n);
        List<Integer> ans = new ArrayList<>();
        for(int n : s)
        {
            if(ans.size() >= 2)
            break;
            int count=0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i] == n)
                count++;
            }
            if(count > (nums.length/3))
            ans.add(n);
        }
        return ans;
    }
}