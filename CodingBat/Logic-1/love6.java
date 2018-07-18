// Codingbat Array-1 problem : love6   
// Problem Link: http://codingbat.com/prob/p137742

public boolean love6(int a, int b) 
{
  return a == 6 || b == 6 || Math.abs(a-b) == 6 || a+b == 6;  
}