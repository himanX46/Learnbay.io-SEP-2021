class Solution {
    public int[][] merge(int[][] intervals) {
        int i=0,j=1;
        while(j<intervals.length){
            if(intervals[i][1]>=intervals[j][0]){
                intervals[i][1] = Math.max(intervals[i][1],intervals[j][1]);
            }else{
                i++;
                intervals[i] = intervals[j];
            }
            j++;
        }

        return Arrays.copyOf(intervals,i+1);
    }

}
