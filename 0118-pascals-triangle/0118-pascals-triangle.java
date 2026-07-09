class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1; i<=n; i++)
        {
            int res=1;
            List<Integer> temp = new ArrayList<>();
            temp.add(res);
            for(int j=1; j<i; j++)
            {
                res = res * (i-j);
                res = res / (j);
                temp.add(res);
            }
            ans.add(temp);
        }
        return ans;
    }
}