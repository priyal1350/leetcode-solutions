class Solution {
    public boolean checkIfPangram(String sentence) {
       int count[]=new int[26];
       for(int i=0;i<sentence.length();i++){
        count[sentence.charAt(i)-'a']++;
       }
       for(int c:count){
        if(c==0)return false;
       }
       return true;
}
}