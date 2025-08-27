//Write an algorithm to determine if a number n is happy.

//LEETCODE 202. Happy Number

class Solution {
    public boolean isHappy(int n) {
      int slow=n;
      int fast=n;
     do
       {
         if(fast==1||slow==1)
          {return true;}
           slow=sum(slow);
          fast= sum(sum(fast)); 
        }while(fast!=slow &&fast>0);
        return fast==1;
    }
     public int sum(int a)
    { int sum=0,n=0;
      while(a>0)
      {
        n= a%10;
        sum += n*n;
      a= a/10;
      }
       return sum;
     }
}