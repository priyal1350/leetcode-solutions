class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        // Array to store frequency of characters (a-z)
        int[] charCount = new int[26];

        // Count frequency of each character in magazine
        for (char c : magazine.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Check if ransomNote can be formed
        for (char c : ransomNote.toCharArray()) {
            if (charCount[c - 'a'] == 0) {
                return false;   // character not available
            }
            charCount[c - 'a']--; // use one character
        }

        // If all characters are available
        return true;
    }
}
