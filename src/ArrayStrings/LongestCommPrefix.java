package ArrayStrings;

public class LongestCommPrefix {
        // Method to find the longest common prefix
        public String longestCommonPrefix(String[] strs) {
            // If the array is empty, return an empty string
            if (strs == null || strs.length == 0) {
                return "";
            }

            // Loop through each character of the first string
            for (int i = 0; i < strs[0].length(); i++) {
                char currentChar = strs[0].charAt(i);

                // Compare the current character with the same position in other strings
                for (int j = 1; j < strs.length; j++) {
                    // If we reach the end of any string or the characters don't match, return the result up to that point
                    if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                        return strs[0].substring(0, i);
                    }
                }
            }
            // If all characters match, return the full first string as the prefix
            return strs[0];
        }
    // Another method to call `longestCommonPrefix`
    public void exampleMethod() {
        String[] words = {"flower", "flow", "flight"};

        // Calling longestCommonPrefix method from within the same class
        String prefix = this.longestCommonPrefix(words);

        // Print the result
        System.out.println("Longest common prefix: " + prefix);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create an instance of LongestCommPrefix
        LongestCommPrefix lcp = new LongestCommPrefix();

        // Call the exampleMethod which calls longestCommonPrefix
        lcp.exampleMethod();
    }
}
