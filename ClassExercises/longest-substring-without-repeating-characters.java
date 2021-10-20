class Solution {
    public int lengthOfLongestSubstring(String s) {
        int winStart=0,winEnd=0,resLen=Integer.MIN_VALUE;
        Map<Character,Integer> hmap = new HashMap<>();
        while(winEnd<s.length()){
            char currChar = s.charAt(winEnd);
            if(hmap.containsKey(currChar)){
                winStart = Math.max(winStart,hmap.get(currChar)+1);
            }
            hmap.put(currChar,winEnd);
            resLen=Math.max(resLen,winEnd-winStart+1);
            winEnd++;
        }
        return resLen==Integer.MIN_VALUE?0:resLen;
    }
}