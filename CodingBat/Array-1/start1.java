// Codingbat Array-1 problem : start1   
// Problem Link: http://codingbat.com/prob/p109660

public int start1(int[] a, int[] b) 
{
  if(a.length < 1 && b.length < 1)
  {
    return 0;
  }
  if((a.length < 1 && b[0] == 1) || (b.length < 1 && a[0] == 1))
  {
    return 1;
  }
  if(a.length > 0 && b.length >0)
  {
    if(a[0] == 1 && b[0] == 1)
    {
      return 2;
    }
    if(a[0] == 1 || b[0] ==1)
    {
      return 1;
    }
  }
  return 0;
}
