package ArrayStrings;

import java.util.HashMap;
import java.util.Map;

class Romans {
    public int romanToInt(String s) {
        // Using Character as key type for single-character Roman numerals
        HashMap<Character, Integer> romans = new HashMap<>(Map.of(
                'M', 1000,
                'D', 500,
                'C', 100,
                'L', 50,
                'X', 10,
                'V', 5,
                'I', 1
        ));

        int sum = 0;

        // Loop through the string
        for (int i = 0; i < s.length() - 1; i++) {
            // If the current numeral is less than the next one, it is part of a subtraction pair
            if (romans.get(s.charAt(i)) < romans.get(s.charAt(i + 1))) {
                sum -= romans.get(s.charAt(i));  // Subtract the current value
            } else {
                sum += romans.get(s.charAt(i));  // Otherwise, just add it
            }
        }

        // Add the last numeral (since the loop only goes to s.length() - 2)
        sum += romans.get(s.charAt(s.length() - 1));

        return sum;
    }
}

public class RomanToInteger {
    public static void main(String[] args) {
        // Create an instance of Romans
        Romans converter = new Romans();

        // Test the romanToInt method
        String roman = "MCMXCIV";  // Example: 1994
        int result = converter.romanToInt(roman);

        // Print the result
        System.out.println("The integer value of " + roman + " is: " + result);
    }
}