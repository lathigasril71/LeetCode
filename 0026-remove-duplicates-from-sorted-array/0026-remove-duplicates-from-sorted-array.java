class Solution {
    public int removeDuplicates(int[] nums) {
        int ans [] = Arrays.stream(nums).distinct().toArray();

        for (int i = 0; i < ans.length; i++) {
            nums[i] = ans[i];
        }
        return ans.length;
    }
}