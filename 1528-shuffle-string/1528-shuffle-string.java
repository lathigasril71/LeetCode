class Solution {
    public String restoreString(String s, int[] indices) {
    Map<Integer,Character> map = new HashMap<>();    
    String t="";
    for(int i=0;i<indices.length;i++)
       map.put(indices[i],s.charAt(i));

    for(int i=0;i<indices.length;i++)
       t += map.get(i); 

    return t;    
    }
}