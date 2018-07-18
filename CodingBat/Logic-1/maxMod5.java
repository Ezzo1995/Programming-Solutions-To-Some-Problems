// Codingbat Array-1 problem : maxMod5   
// Problem Link: http://codingbat.com/prob/p115384

public int maxMod5(int a, int b) 
{
  if(a == b)
  {
    return 0;
  }
  if(a % 5 == b % 5)
  {
    if(a < b)
    {
      return a;
    }
    return b;
  }
  if(a > b)
  {
    return a;
  }
  return b;
}