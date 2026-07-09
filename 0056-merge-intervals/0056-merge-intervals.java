class Solution {
    public int[][] merge(int[][] intervals) {
       if(intervals.length == 0)
       return new int[0][0];

        Arrays.sort(intervals, (a,b)->{
            if(a[0] != b[0])
            return Integer.compare(a[0],b[0]);
            else
            return Integer.compare(a[1],b[1]);
        });

        List<int[]> list = new ArrayList<>();
       int start = intervals[0][0];
       int end = intervals[0][1]; 

       for(int i=1; i<intervals.length;i++)
       {
        if(intervals[i][0] <= end)
        end = Math.max(intervals[i][1],end);

        else
        {
            list.add(new int[]{start,end});
            start = intervals[i][0];
            end = intervals[i][1];
        }
       }
       list.add(new int[]{start,end});
       return list.toArray(new int[list.size()][]);
    }
}