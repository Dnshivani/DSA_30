//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

//LEET CODE 350. Intersection of Two Arrays II

class Solution {
    public int[] intersect(int[] a, int[] b) {
      int m=a.length;  
      Arrays.sort(a);Arrays.sort(b); 
      int n=b.length;
      int i=0,j=0,k=0;
      while(i<m&&j<n)
      {
       if(a[i]==b[j])
       {a[k]=a[i];k++;i++;j++;}
       else if (a[i]<b[j])
       { i++;}
       else
       {j++;}
      }
     
      return Arrays.copyOfRange(a,0,k);
    }
}