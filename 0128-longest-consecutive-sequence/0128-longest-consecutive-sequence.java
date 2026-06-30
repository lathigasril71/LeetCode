class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> s = new HashSet<>();
        for(int num:nums)
        s.add(num);

        int l = 1;
        for(Integer num : s)
        {
            if(!s.contains(num-1))
            {
                int cur_num = num;
                int c = 1;

                while(s.contains(cur_num+1))
                {
                    cur_num ++;
                    c ++;
                }
                l = Math.max(l,c);
            }
        }
        return l;
    }
}