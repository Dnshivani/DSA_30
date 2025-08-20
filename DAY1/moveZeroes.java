//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.  
//LEET-CODE 283

class Solution {
    public void moveZeroes(int[] nums) {
        int i=-1;
        int j=0;
        while(j!=nums.length)
        {
          if(nums[j]!=0){
          i++;
          int temp=nums[i];
          nums[i]=nums[j];
          nums[j]=temp;
          j++;
          }
          else{j++;}
        }
        
    }
}