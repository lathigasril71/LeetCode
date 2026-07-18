class Solution {
    public List<String> letterCombinations(String digits) {
       String[] mapping = {
        "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
       };
       List<String> list = new ArrayList<>();
       StringBuilder sb = new StringBuilder();
       generate(list,sb,mapping,digits,0);
       return list;
    }

    void generate(List<String> list,StringBuilder sb,String[] mapping,String digits,int ind)
    {
        if(ind == digits.length())
        {
            list.add(sb.toString());
            return;
        }

        int digit = digits.charAt(ind)-'0';
        String letters = mapping[digit];

        for(char let : letters.toCharArray())
        {
            sb.append(let);
            generate(list,sb,mapping,digits,ind+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}