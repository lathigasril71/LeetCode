class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(nums);
        func(0,list,ds,nums);
        return list;
    }
    void func(int ind,List<List<Integer>> list, List<Integer>ds, int[]nums)
    {
        if(ind == nums.length)
        {
            if(!list.contains(ds))
            list.add(new ArrayList<>(ds));
            return;
        }

        ds.add(nums[ind]);
        func(ind+1,list,ds,nums);
        ds.remove(ds.size()-1);
        func(ind+1,list,ds,nums);
    }
}