class Solution {
    public int firstUniqChar(String s) {
        int i=0;
        int j=s.length();
        int count[]=new int[26];
        while(i<j){
        count[s.charAt(i)-'a']++;
        i++;
        }
        int k=0;
        while(k<j){
        if(count[s.charAt(k)-'a']==1)
            return k;
            k++;
        }
          return -1;
        }
      
    }
