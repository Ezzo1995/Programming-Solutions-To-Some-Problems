// Codingbat Array-1 problem : inOrder   
// Problem Link: http://codingbat.com/prob/p154188

public boolean inOrder(int a, int b, int c, boolean bOk) 
{
  if(bOk)
  {
    return c > b;
  }
  return b > a && c > b; 
}