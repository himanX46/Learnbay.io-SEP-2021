class Solution {
    public boolean checkInclusion(String s1, String s2) {
       Map<Character,Integer> charCountMap = new HashMap<>();
       for(int i=0;i<s1.length();i++)
           charCountMap.put(s1.charAt(i),charCountMap.getOrDefault(s1.charAt(i),0)+1);
       int start=0,end=0,matched=0;
       while(end<s2.length()){
           char currChar = s2.charAt(end);
           if(charCountMap.containsKey(currChar)){
               charCountMap.put(currChar,charCountMap.get(currChar)-1);
               if(charCountMap.get(currChar)==0)
                   matched++;
           }
           //start
           while(end-start+1>s1.length()){
               char startChar = s2.charAt(start);
               if(charCountMap.containsKey(startChar)){
                   if(charCountMap.get(startChar)==0)
                       matched--;
                   charCountMap.put(startChar,charCountMap.get(startChar)+1);
               }
               start++;
           }
           if(matched==charCountMap.size())
               return true;
           end++;
       } 
        return false;
    }
}