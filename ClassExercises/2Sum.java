class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hmap = new HashMap<>();
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            int toBeFound = target-nums[i];
            if(hmap.containsKey(toBeFound)){
                result[0] = hmap.get(toBeFound);
                result[1] = i;
                return result;
            }
            hmap.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}