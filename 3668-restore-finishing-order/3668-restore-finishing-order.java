class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        List<Integer> ol = Arrays.stream(friends).boxed().collect(Collectors.toList());
        int ans[] = new int[friends.length];
        int c=0;
        for(int i=0;i<order.length;i++)
        if(ol.contains(order[i]))
        ans[c++]=order[i];

        return ans;
    }
}