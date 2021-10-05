class Solution {
   public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums==null || nums.length==0)
        	return res;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
        	//skip for i
        	if(i>0 && nums[i-1]==nums[i])
        		continue;
        	int j = i+1;
        	int k = nums.length-1;
        	while(j<k){
        		int sum = nums[i]+nums[j]+nums[k];
        		if(sum==0){
        			res.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
        			j++;
        			k--;
        			//skipping condition for j and k
            		while(j<k && nums[j]==nums[j-1])
            			j++;
            		while(k>j && nums[k]==nums[k+1])
            			k--;
        		}else if(sum<0){
        			j++;
        			//skipping condition for j
        			while(j<k && nums[j]==nums[j-1])
            			j++;
        		}else{
        			k--;
        			while(k>0 && nums[k]==nums[k+1])
            			k--;
        		}
        		
        	}
        	
        }
        return res;
    }

}