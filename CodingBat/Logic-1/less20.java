// Codingbat Array-1 problem : less20   
// Problem Link: http://codingbat.com/prob/p133158

public boolean less20(int n)
{
  return (n+1) % 20 == 0 || (n+2) % 20 == 0;  
}