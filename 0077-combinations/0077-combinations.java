class Solution {
    public List<List<Integer>> combine(int n, int k) {
       int nums[] = new int[n];
       for(int i=1;i<=n;i++)
       nums[i-1] = i;

       List<List<Integer>> list = new ArrayList<>();
       List<Integer> ds = new ArrayList<>();
       func(0,list,ds,nums,k);
       return list; 
    }

    void func(int ind,List<List<Integer>> list,List<Integer> ds,int[] nums,int k)
    {
        if(ds.size() == k)
        {
        list.add(new ArrayList<>(ds));   
        return;
        }

        if(ind == nums.length || ds.size() > k)
        return;

        ds.add(nums[ind]);
        func(ind+1,list,ds,nums,k);
        ds.remove(ds.size()-1); 
        func(ind+1,list,ds,nums,k);
    }
}