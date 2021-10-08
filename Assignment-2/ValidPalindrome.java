class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        boolean isPalindrome=false;
        s = s.toLowerCase();
        if(s.length()<=1)
            return true;
        while(left<right){
        	    while(!(s.charAt(left)>='a' && s.charAt(left)<='z'))
        	    	left++;
        	    while(!(s.charAt(right)>='a' && s.charAt(right)<='z'))
        	    	right--;
                if(s.charAt(left) == s.charAt(right)){
                    isPalindrome = true;
                    left++;
                    right--;
                }
                else{
                	isPalindrome = false;
                	break;
                }                
        }
        return isPalindrome;
    }
}