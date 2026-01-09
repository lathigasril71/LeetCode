class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> ol = new ArrayList<>();
        for(int temp : nums)
        if(!ol.contains(temp))
        ol.add(temp);
        else
        ol.remove(Integer.valueOf(temp));

        return ol.get(0);
    }
}