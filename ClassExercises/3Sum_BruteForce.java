class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Map<String,String> hmap = new HashMap<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=nums.length-1;k>j;k--){
                    if(nums[i]+nums[j]+nums[k]==0 && i!=j && j!=k && k!=i){
                            String s = Integer.toString(nums[i])+"#"+Integer.toString(nums[j])+"#"+Integer.toString(nums[k]);
                        if(hmap.containsValue(s)){
                            continue;
                        }else{
                            hmap.put(s,s);
                            res.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                        }
   
                    }
                }
            }
        }
        return res;
    }
}