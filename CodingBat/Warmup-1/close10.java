// Codingbat warmup-1 problem : close10
// Problem Link: http://codingbat.com/prob/p172021

public int close10(int a, int b)
{
  int aAbs = Math.abs(a - 10);
  int bAbs = Math.abs(b - 10);
  
  if(aAbs<bAbs) return a;
  if(bAbs<aAbs) return b;
  return 0;
  
}