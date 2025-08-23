//Given a string s consisting of words and spaces, return the length of the last word in the string.

// LEET CODE 58

class Solution {
    public int lengthOfLastWord(String s) {
      s=s.trim();

        int l=s.lastIndexOf(" ");
        int count=0;
        int n=s.length();
     
      return n-l-1;
    }
}