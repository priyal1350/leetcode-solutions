class Solution {
    public int maxDepth(String s) {
        int curropen=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                curropen++;
            }
            else if(s.charAt(i)==')'){
                curropen--;
            }
            max=Math.max(max,curropen);
            
        }
        return max;
    }
}