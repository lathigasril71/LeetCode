class Solution {
    public int subarraySum(int[] nums, int k) {
        int presum=0;
        int cnt=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            presum += nums[i];
            int rem = presum - k;
            if(map.containsKey(rem))
                cnt += map.get(rem);

            if(map.containsKey(presum))
                map.put(presum,map.get(presum)+1);
            else
                map.put(presum,1);
        }
        return cnt;
    }
}