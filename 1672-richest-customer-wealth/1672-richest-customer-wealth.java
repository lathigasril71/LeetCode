class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans[] = new int[accounts.length];
        int c=0;
        for(int i=0;i<accounts.length;i++)
        {
        for(int j=0;j<accounts[i].length;j++)
        ans[c] = ans[c]+accounts[i][j];
        c++;
        }
        return Arrays.stream(ans).max().getAsInt();
    }
}