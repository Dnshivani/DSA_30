//Given an integer x, return true if x is a palindrome, and false otherwise.
// LEET CODE 9

import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int x) {
        int sum=0,r ,og=x;
        while(x>0)
        {
        //System.out.print(x+" ");
        r=x%10;
        sum=sum*10+r;
        x=x/10;
        }
        if(og==sum)
        {return true;}
        else
        { return false;}
        
    }
    public  static void main(String arg[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("x=");
        int x =sc.nextInt();
        Solution ob1=new Solution();
        System.out.println(ob1.isPalindrome(x));
    }
}
