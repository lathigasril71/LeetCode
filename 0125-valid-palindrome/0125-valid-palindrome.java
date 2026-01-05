class Solution {
    public boolean isPalindrome(String s) {
        String s1="";
       char a[] = s.toCharArray();
        for(char temp : a)
        {
            if(Character.isLetterOrDigit(temp))
            s1+=Character.toLowerCase(temp);
        }
        StringBuilder sb = new StringBuilder(s1);
        String s2=sb.reverse().toString();
        return s1.equals(s2);
    }
}