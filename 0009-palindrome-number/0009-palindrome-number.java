class Solution {
    public boolean isPalindrome(int x) {
        String s1="";;
        if(x < 0)
        return false;
        
            s1 = Integer.toString(x);
            String s2 = new StringBuilder(s1).reverse().toString();
        
        return s1.equals(s2); 
    }
}