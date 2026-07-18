class Solution {
    public List<String> generateParenthesis(int n) {
      List<String> list = new ArrayList<>();
      StringBuilder sb = new StringBuilder();  
      generate(list,sb,0,0,n);
      return list;
    }

    void generate(List<String> list, StringBuilder sb, int openP, int closeP, int n)
    {
        if(openP == n && closeP == n)
        {
            list.add(sb.toString());
            return;
        }

        if(openP < n)
        {
            sb.append("(");
            generate(list,sb,openP+1,closeP,n);
            sb.deleteCharAt(sb.length()-1);
        }

        if(closeP < openP)
        {
            sb.append(")");
            generate(list,sb,openP,closeP+1,n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}