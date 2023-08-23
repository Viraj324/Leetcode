242. Valid Anagram
Easy
10.2K
323
Companies
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

Accepted
2.5M
Submit
======================================================================================
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
             return false;
        }

        int[] char_count = new int[26];

        for(int i = 0;i<s.length();i++){
            char_count[s.charAt(i) - 'a']++;
            char_count[t.charAt(i) - 'a']--;
        }

        for(int count : char_count){
            if(count!=0){
                return false;
            }
        }

        return true;
    }
}
---------------------------------------------------------------------------------------------------------
 //Approach 2
 class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
             return false;
        }
        String s1 = sort1(s);
        String s2 = sort1(t);

        for(int i = 0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public String sort1(String s){
        char c[] = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}
