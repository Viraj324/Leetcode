Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 

Constraints:

1 <= s.length <= 104
s contains English letters (upper-case and lower-case), digits, and spaces ' '.
There is at least one word in s.
 

Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?
  -------------------------------------------------------------------------------------------------------
  class Solution {
    public String reverseWords(String s) {
        String trimmed = s.trim(); // Remove leading and trailing spaces
        String[] arr = trimmed.split("\\s+"); // Split using one or more spaces
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int x = 0; x < arr.length; x++) {
            sb.append(arr[x]);
            if (x < arr.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}

