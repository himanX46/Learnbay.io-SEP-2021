class Solution {
    public void sortColors(int[] nums) {
        int start=0,curr=0,end=nums.length-1;
        while(curr<=end){
            if(nums[curr]==2){
                swap(nums,curr,end);
                end--;
            }else if(nums[curr]==0){
                swap(nums,curr,start);
                start++;
                curr++;
            }else
                curr++;
        }
    }
    public void swap(int[] nums,int num1,int num2){
        int temp=0;
        temp = nums[num1];
        nums[num1]=nums[num2];
        nums[num2]=temp;
    }
}