class Solution {
    public int totalFruit(int[] fruits) {
    Map<Integer,Integer> map = new HashMap<>();
    int l=0,r=0;
    int maxlen = r-l+1;
    while(r < fruits.length)
    {
        map.put(fruits[r], map.getOrDefault(fruits[r],0)+1);
        while(map.size()>2)
        {
            map.merge(fruits[l],-1,Integer::sum);
            if (map.get(fruits[l]) == 0) 
                map.remove(fruits[l]);
            l++;
        }
        maxlen = Math.max(maxlen,r-l+1);
        r++;
    } 
    return maxlen;   
    }
}