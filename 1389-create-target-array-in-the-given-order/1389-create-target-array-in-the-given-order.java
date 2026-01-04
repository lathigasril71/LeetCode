class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> al = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        al.add(index[i],nums[i]);

        int ans[] = new int[nums.length];
        int ind=0;
        for(Integer temp : al)
        ans[ind++] = temp;

        return ans; 
}
}