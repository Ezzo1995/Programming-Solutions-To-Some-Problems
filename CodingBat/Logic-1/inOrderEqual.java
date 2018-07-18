// Codingbat Array-1 problem : inOrderEqual   
// Problem Link: http://codingbat.com/prob/p140272

public boolean inOrderEqual(int a, int b, int c, boolean equalOk) 
{
  if(equalOk)
  {
    return a <= b && b <= c;
  }
  return a < b && b < c;  
}