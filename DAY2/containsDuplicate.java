//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 //LEET CODE 217

class Solution {
    public boolean containsDuplicate(int[] nums) {
          int i=0;
          int n=nums.length;  
          Arrays.sort(nums);
        while(i<n-1)
         {
          if(nums[i]==nums[++i])
          { return true;}
         
         }  
         return false;
    }
}