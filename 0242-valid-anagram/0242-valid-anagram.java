class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}
// int[] freq = new int[26];

// for (char c : s.toCharArray()) freq[c - 'a']++;
// for (char c : t.toCharArray()) freq[c - 'a']--;

// for (int x : freq)
//     if (x != 0) return false;

// return true;
// public boolean isAnagram(String s, String t) {
//     if (s.length() != t.length()) return false;

//     int[] count = new int[26];

//     for (int i = 0; i < s.length(); i++) {
//         count[s.charAt(i) - 'a']++;
//         count[t.charAt(i) - 'a']--;
//     }

//     for (int c : count) {
//         if (c != 0) return false;
//     }
//     return true;
// }
