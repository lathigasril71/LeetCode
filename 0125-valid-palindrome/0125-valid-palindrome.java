class Solution {
    public boolean isPalindrome(String s) {
    int l=0, r = s.length()-1;
    String s1 = s.toLowerCase();
    StringBuilder sb = new StringBuilder();
    while(l < r)
    {
        if(Character.isLetterOrDigit(s1.charAt(l)) && Character.isLetterOrDigit(s1.charAt(r)))
        {
            if(s1.charAt(l) == s1.charAt(r))
            {
                l++;
                r--;
            }
            else
            return false;
        }
        else if(!Character.isLetterOrDigit(s1.charAt(l)))
        l++;
        else 
        r--;
    }  
    return true; 
    }
}