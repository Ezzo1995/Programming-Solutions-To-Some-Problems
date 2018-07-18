// Codingbat Array-1 problem : greenTicket   
// Problem Link: http://codingbat.com/prob/p120633

public int greenTicket(int a, int b, int c)
{
  if(a == b && b == c)
  {
    return 20;
  }
  if(a == b || b == c || a == c)
  {
    return 10;
  }
  return 0;
}