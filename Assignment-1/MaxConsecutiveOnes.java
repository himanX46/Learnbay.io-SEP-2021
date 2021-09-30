class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max1 = 0;
        int max2 = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                if(max1>max2) 
                    max2=max1;
                max1=0;
            }else{
                max1++;
            }
        }
        if(max1>max2)
            max2=max1;
        
        return max2;
    }
}