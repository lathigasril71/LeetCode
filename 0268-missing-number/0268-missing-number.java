class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        List<Integer> ol = Arrays.stream(nums).boxed().collect(Collectors.toList());
        for(int i=0;i<=n;i++)
        if(!ol.contains(i))
        return i;

        return -1;
    }
}