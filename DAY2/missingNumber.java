//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

 //LEETCODE 268

class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int i=0;
        int totalsum=n*(n+1)/2;
        int sum=0;
      while(i<n)
      {sum +=nums[i++];  }

      return totalsum-sum;

    }
}