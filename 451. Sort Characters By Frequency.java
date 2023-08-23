451. Sort Characters By Frequency
Medium
7.1K
238
Companies
Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.

 

Example 1:

Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
Example 2:

Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.
Example 3:

Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
 

Constraints:

1 <= s.length <= 5 * 105
s consists of uppercase and lowercase English letters and digits.
Accepted
532.2K
Submissions
757.3K
Acceptance Rate
70.3%
--------------------------------------------------------------------------
class Solution {
    public String frequencySort(String s) {
        char[] arr = new char[256];
        for(int i = 0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        StringBuilder sb = new StringBuilder("");
        int max = -1;
        while(max!=0){
            max = -1;
            char maxi = 0;
            for(char i = 0;i<arr.length;i++){
                if(arr[i] > max){
                    max = arr[i];
                    maxi = i;
                }
            }
            for(int i = 0;i<max;i++){
                sb.append(maxi);
            }
            arr[maxi] = 0;
        }
        return sb.toString();
    }
}
