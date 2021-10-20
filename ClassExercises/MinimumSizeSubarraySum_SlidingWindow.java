class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0, end = 0, minLen = Integer.MAX_VALUE, sum = 0;
        while(end<nums.length){
            sum += nums[end];
            while(sum>=target){
                int len = end-start+1;
                minLen = Math.min(minLen,len);
                sum-=nums[start];
                start++;
            }
            end++;
        }
        return minLen==Integer.MAX_VALUE?0:minLen;
    }
}