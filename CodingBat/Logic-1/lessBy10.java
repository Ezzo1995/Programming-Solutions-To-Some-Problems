// Codingbat Array-1 problem : lessBy10   
// Problem Link: http://codingbat.com/prob/p179196

public boolean lessBy10(int a, int b, int c)
{
  return Math.abs(a-b) >= 10 || Math.abs(b-c) >= 10 || Math.abs(a-c) >= 10;  
}
