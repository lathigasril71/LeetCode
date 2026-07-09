class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(ans.size() == 2)
            break;
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i]) == (nums.length/3)+1)
            ans.add(nums[i]);
        }
        return ans;
    }
}