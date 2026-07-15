class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
       List<List<Integer>> list = new ArrayList<>();
       List<Integer> ds = new ArrayList<>();
       func(0,list,ds,nums,target);
       return list;  
    }

    void func(int ind,List<List<Integer>> list,List<Integer> ds,int[] nums,int target)
    {
        if(ind == nums.length)
        {
            if(target == 0)
            {
                list.add(new ArrayList<>(ds));
            }
            return;
        }

        if(nums[ind] <= target)
        {
            ds.add(nums[ind]);
            func(ind,list,ds,nums,target-nums[ind]);
            ds.remove(ds.size()-1);
        }
        func(ind+1,list,ds,nums,target);
    }

        
}