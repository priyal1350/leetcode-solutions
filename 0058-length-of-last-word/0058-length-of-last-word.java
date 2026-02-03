// class Solution {
//     public int lengthOfLastWord(String s) {
//         s = s.trim();   // remove extra spaces
//         int count = 0;

//         for (int i = s.length() - 1; i >= 0; i--) {
//             if (s.charAt(i) != ' ')
//                 count++;
//             else
//                 break;
//         }
//         return count;
//     }
// }
class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int count = 0;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count last word characters
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }
}

