// Codingbat Array-1 problem : front11   
// Problem Link: http://codingbat.com/prob/p128270

public int[] front11(int[] a, int[] b)
{
  int[] result = new int[2];
  int[] tmp = new int[1];
  if(a.length == 0 && b.length == 0)
  {
    return a;
  }
  
  if(a.length == 0)
  {
     tmp[0] = b[0];
     return tmp;
  }
  
  if(b.length == 0)
  {
    tmp[0] = a[0];
    return tmp;
  }
  
  result[0] = a[0];
  result[1] = b[0];
  
  return result;
}