Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//LEET CODE 4. Median of Two Sorted Arrays

class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
      
       int m=a.length;
       int n=b.length;
       if(m>n){ return  findMedianSortedArrays(b,a);}
      int  start=0,end=m;
       while(start<=end)
       {
        int part1=(start+end)/2;
        int part2=(m+n+1)/2-part1;
        int leftnum1=(part1==0)?Integer.MIN_VALUE:a[part1-1];
        int leftnum2=(part2==0)?Integer.MIN_VALUE:b[part2-1];
        int rightnum1=(part1==m)?Integer.MAX_VALUE:a[part1];
        int rightnum2=(part2==n)?Integer.MAX_VALUE:b[part2];
        if(leftnum1<=rightnum2&&leftnum2<=rightnum1)
        {
          if((m+n)%2==0)
          {return (Math.max(leftnum1,leftnum2)+Math.min(rightnum1,rightnum2))/2.0;}
          else
          {return Math.max(leftnum1,leftnum2);}
        }
        else  if(leftnum1>rightnum2)
        {end=part1-1;}
        else
        {start=part1+1;}
       }
        throw new IllegalArgumentException();      
        }
} 