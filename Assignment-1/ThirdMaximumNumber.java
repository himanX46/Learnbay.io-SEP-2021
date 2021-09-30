class Solution {
 public int thirdMax(int[] nums) {
        Integer max = null;
        Integer sec = null;
        Integer third = null;
        for(Integer n : nums){
            if(n.equals(max)||n.equals(sec)||n.equals(third)) continue;
            if(max==null||n>max){
                third = sec;
                sec = max;
                max = n;
            }else if(sec==null || (n>sec && n<max)){
                third = sec;
                sec = n;
            }else if(third==null || (n>third && n<sec))
                third = n;
        }
        if(third==null)
            return max;
        else return third;
    }
}