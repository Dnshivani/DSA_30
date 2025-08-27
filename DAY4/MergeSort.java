//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//LEET CODE 88. Merge Sorted Array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int i=0,j=0,temp=0;
      while(i<m&&j<n)
      {
      
       if(nums1[i]<=nums2[j])
       { i++; }
      else 
      {
        for(int k=m;k>i;k--)
        {nums1[k]=nums1[k-1];}
        nums1[i]=nums2[j];
        j++;
        m++;
        i++;
      }
    }
      while(j<n)
      {nums1[i]=nums2[j];
      i++;
      j++;
      }

    }
}