// Codingbat Array-1 problem : shareDigit   
// Problem Link: http://codingbat.com/prob/p153748

public boolean shareDigit(int a, int b)
{
   return a/10 == b/10 || a/10 == b%10 || a%10 == b/10 || a%10 == b%10;  
}