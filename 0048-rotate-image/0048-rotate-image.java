class Solution {
    public void rotate(int[][] matrix) {
       int n = matrix[0].length;
       for(int i=0;i<n-1;i++)
       {
        for(int j=i+1;j<n;j++)
        {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
       }
       for(int i=0;i<n;i++)
       reverse(i,n-1,matrix);
    }
    void reverse(int p1,int p2, int matrix[][])
    {
        int start=0,end = p2;
        while(start < end)
        {
            int temp = matrix[p1][start];
            matrix[p1][start] = matrix[p1][end];
            matrix[p1][end] = temp;
            start++;
            end--;
        }
    }
}