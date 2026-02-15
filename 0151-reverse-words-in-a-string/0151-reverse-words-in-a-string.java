class Solution {
    public String reverseWords(String s) {

        // Step 1: Remove leading and trailing spaces from the string
        s = s.trim();

        // Step 2: Split the string into words
        // "\\s+" means one or more spaces (handles multiple spaces between words)
        String[] words = s.split("\\s+");

        // Step 3: Use StringBuilder to efficiently build the result
        StringBuilder sb = new StringBuilder();

        // Step 4: Traverse the words array from end to start
        for (int i = words.length - 1; i >= 0; i--) {

            // Append the current word
            sb.append(words[i]);

            // Add a space after each word except the last one
            if (i > 0) {
                sb.append(" ");
            }
        }

        // Step 5: Convert StringBuilder to String and return
        return sb.toString();
    }
}