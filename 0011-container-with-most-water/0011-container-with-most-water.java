class Solution {
    public int maxArea(int[] height) {
    int maxh = Integer.MIN_VALUE;
    int left = 0;
    int n = height.length;
    int right = n-1;
    for(int i=0;i<n;i++)
    {
        int width = Math.abs(left-right);
        int minh = Math.min(height[left],height[right]);
        maxh = Math.max(maxh, minh*width);
        if(height[left] > height[right])
        right--;
        else
        left++;
    }  
    return maxh; 
    }
}