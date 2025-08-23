//Given a roman numeral, convert it to an integer.
//LEET CODE 13
class Solution {
    public int romanToInt(String s) {
       int  total=0;
       int prev=0;
       int n=s.length()-1;

       while(n>-1)
       {
        int currvalue=values(s.charAt(n));
        
        if(currvalue>= prev)
        {
          total+=currvalue;
        }
        else{ total-=currvalue;}
        n--;
       prev= currvalue;
       }
       return total;
    }
    public int values(char c)
    {
      switch(c)
      {
        case 'I': return 1;
        case 'V': return 5;
        case 'X':return 10;
        case 'L':return 50;
        case 'C':return 100;
        case 'D':return 500;
        case 'M':return 1000;
        default : return -1;
      }
    }
}