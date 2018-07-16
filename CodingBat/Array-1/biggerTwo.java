// Codingbat Array-1 problem : biggerTwo   
// Problem Link: http://codingbat.com/prob/p109537

public int[] biggerTwo(int[] a, int[] b)
{
  if(a[0] + a[1] >= b[0] + b[1])
  {
    return a;
  }
  return b;
}
