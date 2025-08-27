//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

//LEET CODE 350. Intersection of Two Arrays II

class Solution {
    public int[] intersect(int[] a, int[] b) {
      int m=a.length;  
      Arrays.sort(a);Arrays.sort(b); 
      int n=b.length;
      List<Integer> result=new ArrayList<>();
      int i=0,j=0,k=0;
      while(i<m&&j<n)
      {
       if(a[i]==b[j])
       {result.add(a[i]);k++;i++;j++;}
       else if (a[i]<b[j])
       { i++;}
       else
       {j++;}
      }
      int[] r=new int[result.size()];
      for(int q=0;q<result.size();q++)
      {
        r[q]=result.get(q);
      }
      return r;
    }
}