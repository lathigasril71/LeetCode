class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
       List<List<Integer>> list = new ArrayList<>();
       List<Integer> ds = new ArrayList<>();
       func(1,list,ds,n,k);
       return list; 
    }

    void func(int ind,List<List<Integer>> list,List<Integer> ds,int n, int k)
    {
        if(n == 0 && ds.size() == k)
        {
        list.add(new ArrayList<>(ds));
        return;
        }

        for(int i=ind;i<=9;i++)
        {
        
        if(ds.size() > k || n < i)
        return;

        ds.add(i);
        func(i+1,list,ds,n-i,k);
        ds.remove(ds.size()-1);
        }
    }
}