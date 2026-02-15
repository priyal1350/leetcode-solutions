class Solution {
    public boolean checkIfPangram(String sentence) {
       int count[]=new int[26];
       char arr[]=sentence.toCharArray();
       for(int i=0;i<arr.length;i++){
          count[arr[i]-'a']++;
       }
       for(int c:count){
        if(c==0)return false;
       } 
       return true;
    }
}