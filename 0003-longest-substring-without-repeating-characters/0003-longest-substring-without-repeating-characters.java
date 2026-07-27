class Solution {
    public int lengthOfLongestSubstring(String s) {
    List<Character> list = new ArrayList<>();
    int maxsum = 0;
    for(int i=0;i<s.length();i++)
    {
        if(!list.contains(s.charAt(i)))
        {
        list.add(s.charAt(i));
        maxsum = Math.max(maxsum, list.size());
        }
        else
        {
            while(list.contains(s.charAt(i)))
            list.removeFirst();
            list.add(s.charAt(i));
            maxsum = Math.max(maxsum, list.size());
        }
    } 
    return maxsum;   
    }
}