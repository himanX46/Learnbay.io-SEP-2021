class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        boolean isMax = false;
		for(int i=0;i<nums1.length;i++){
			isMax = false;
			for(int j=0;j<nums2.length;j++){
				if(isMax)
					break;
				if(nums1[i]==nums2[j]){
					while(j<nums2.length){
						if(nums2[j]>nums1[i]){
							nums1[i] = nums2[j];
							isMax = true;
							break;
						}else if(j+1==nums2.length){
							nums1[i]=-1;
							isMax = true;
							break;
						}else{
							j++;
						}
					}
				}
			}
		}
		return nums1;
    }
}