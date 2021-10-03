class Solution {
    public int maxArea(int[] height) {
        
        int start=0,end=height.length-1;
        int area=0,max=0;
        
        while(start<end){
            area = Math.min(height[start],height[end])*(end-start);
            if(area>=max)
                max=area;
            if(height[start]>=height[end]){
                end--;
            }else{
                start++;
            }
        }
        return max;
    }
}