class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        for(int[] slots : intervals){
            if(slots[0] > newInterval[1]){
                list.add(newInterval);
                newInterval = slots;
            }else if(newInterval[0]>slots[1]){
                list.add(slots);
            }else {
                newInterval[0] = Math.min(newInterval[0], slots[0]);
                newInterval[1] = Math.max(newInterval[1], slots[1]);
            }
        }
        list.add(newInterval);
        return list.toArray(new int[list.size()][]);
    }
}
