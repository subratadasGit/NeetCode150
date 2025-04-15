import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        // Convert both strings to character arrays
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        // Sort the character arrays
        Arrays.sort(sc);
        Arrays.sort(tc);

        // Convert the sorted arrays back to strings and compare
        if (new String(sc).equals(new String(tc))) {
            return true; // If sorted strings are equal, s and t are anagrams
        }

        return false; // Otherwise, they are not anagrams
    }
}

// Complexity O(nlogn)