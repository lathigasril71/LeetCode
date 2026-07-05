class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        int start = 0;
        int end = arr.length-1;
        while(start < end)
        {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            ans.append(arr[start]);
            ans.append(" ");
            start++;
            end--;
        }
        while(start < arr.length)
        {
            ans.append(arr[start]);
            ans.append(" ");
            start++;
        }
        return ans.toString().trim();

    }
}