class Solution {
    public int myAtoi(String s) {
        String modString = s.trim();
        if(modString == ""|| modString.length()==0)
            return 0;
        char ch = modString.charAt(0);
        int sign = ch=='-'?-1:1;
        int currIdx = ch=='-'||ch=='+'?1:0;
        long res = 0;
        while(currIdx<modString.length()){
            char currChar = modString.charAt(currIdx);
            if(Character.isDigit(currChar)){
                res = res*10+(currChar-'0');
                //overflow
                if(res>Integer.MAX_VALUE)
                    return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
                else if(res<Integer.MIN_VALUE)
                    return sign==-1?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            else
                return sign*(int)res;
            currIdx++;
        }
        return sign*(int)res;

    }
}
