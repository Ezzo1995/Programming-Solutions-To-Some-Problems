// Codingbat Array-1 problem : make2   
// Problem Link: http://codingbat.com/prob/p143461

public int[] make2(int[] a, int[] b)
{
  int[] result = new int[2];
  int ptr = 0;
  
  for(int i = 0; i < a.length; i++)
  {
    if(ptr < 2)
    {
      result[i] = a[i];
      ptr++;
    }
  }
  
  for(int i = 0; i < b.length; i++)
  {
    if(ptr < 2)
    {
      result[ptr] = b[i];
      ptr++;
    }
  }
  return result;
}