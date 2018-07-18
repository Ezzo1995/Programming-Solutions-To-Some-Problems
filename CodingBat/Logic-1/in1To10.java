// Codingbat Array-1 problem : in1To10   
// Problem Link: http://codingbat.com/prob/p137365

public boolean in1To10(int n, boolean outsideMode)
{
  if(outsideMode)
  {
    return n <= 1 || n >= 10;
  }
  return n >= 1 && n <= 10;
}