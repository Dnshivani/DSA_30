//Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).
//LEET CODE 191. Number of 1 Bits.

class Solution {
    public int hammingWeight(int n) { 
      int count=0;
      while(n!=0)
      {
        n &=n-1;
        count++;
      }
      return count;

    }
}