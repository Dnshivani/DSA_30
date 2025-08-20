/*Given an integer array nums of length n,  create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] 
Specifically, ans is the concatenation of two nums arrays.
Return the array ans.  */

//LEET-CODE 1929


class Solution {
    public int[] getConcatenation(int[] nums) {
      int n=nums.length;
        int[] a=new int[2*n];
        int j=0;
       for(int i=0;i<nums.length;i++)
        {
          
          a[i]=nums[i];
          a[i+n]=nums[i];
        }
        return a;
    }
}

