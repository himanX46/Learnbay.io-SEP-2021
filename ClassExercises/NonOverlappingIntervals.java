class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int i=0, j=1, count = 0;
        Arrays.sort(intervals,(o1,o2)->Integer.compare(o1[1],o2[1]));
        while(j<intervals.length){
            if(intervals[i][1]<=intervals[j][0]){
                i=j;
            }else{
                count++;
            }
            j++;
        }
        return count;
    }
}
