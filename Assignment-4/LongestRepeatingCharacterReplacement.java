class Solution {
    public int characterReplacement(String s, int k) {
        int start=0,end=0,counter=k,countLen=0,maxLen=0;
        while(end<s.length()){
            if(s.charAt(end)==s.charAt(start)){
                countLen++;
                end++;
            }else{
                if(counter<=0){
                    start = end;
                    maxLen=Math.max(countLen,maxLen);
                }
                counter--;
            }
        }
        return maxLen;
    }
}
