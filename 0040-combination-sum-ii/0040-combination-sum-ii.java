class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
       Arrays.sort(nums);
       List<List<Integer>> list = new ArrayList<>();
       List<Integer> ds = new ArrayList<>();
       func(0,list,ds,nums,target);
       return list; 
    }

    void func(int ind,List<List<Integer>> list,List<Integer> ds,int[] nums,int target)
    {
        if(target == 0)
        {
        list.add(new ArrayList<>(ds));
        return;
        }
        for(int i=ind; i<nums.length;i++)
        {
            if(i > ind && nums[i] == nums[i-1])
            continue;
            if(target < nums[i])
            break;

            ds.add(nums[i]);
            func(i+1,list,ds,nums,target-nums[i]);
            ds.remove(ds.size()-1);
        }
    }
}