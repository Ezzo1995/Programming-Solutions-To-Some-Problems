// Codingbat Array-1 problem : specialEleven   
// Problem Link: http://codingbat.com/prob/p100962

public boolean specialEleven(int n)
{
  return n % 11 == 0 || (n-1) % 11 == 0;
}