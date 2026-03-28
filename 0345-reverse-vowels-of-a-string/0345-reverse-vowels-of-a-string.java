class Solution {
    public String reverseVowels(String s) {

        // Convert string to char array (strings are immutable in Java)
        // char[] arr = s.toCharArray();

        // // Set of vowels for fast lookup
        // String vowels = "aeiouAEIOU";

        // int left = 0;
        // int right = arr.length - 1;

        // while (left < right) {

        //     // Move left pointer until vowel is found
        //     while (left < right && vowels.indexOf(arr[left]) == -1) {
        //         left++;
        //     }

        //     // Move right pointer until vowel is found
        //     while (left < right && vowels.indexOf(arr[right]) == -1) {
        //         right--;
        //     }

        //     // Swap vowels
        //     char temp = arr[left];
        //     arr[left] = arr[right];
        //     arr[right] = temp;

        //     left++;
        //     right--;
        // }

        // return new String(arr);

    //     char []arr=s.toCharArray();
    //     int left=0;
    //     int right=arr.length-1;
    //     while(left<right){
    //         while(left<right && !isVowel(arr[left])){
    //             left++;
    //         }
    //         while(left<right && !isVowel(arr[right])){
    //             right--;
    //         }
    //         char temp=arr[left];
    //         arr[left]=arr[right];
    //         arr[right]=temp;

    //         left++;
    //         right--;
    //     }
    //     return new String(arr);
    // }
    //     public boolean isVowel(char c){
    //          return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'
    //         ||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    //     }
           char arr[]=s.toCharArray();
           int left=0;
           int right=arr.length-1;
           while(left<right){
            while(left<right && !isVowel(arr[left]))
            left++;
            while(left<right && !isVowel(arr[right]))
            right--;
           
           char temp=arr[left];
           arr[left]=arr[right];
           arr[right]=temp;
           left++;
           right--;
    }
           return new String(arr);
    }
    public boolean isVowel(char c){
       return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'
       ||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }

}