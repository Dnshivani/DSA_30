//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
//LEETCODE 383

class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        int i=0;
       while(i<n)
       {
        char j=s.charAt(i);
        if(s.indexOf(j)==s.lastIndexOf(j))
        {return i;}
        i++;


       }
     return -1;
   }
    }

   