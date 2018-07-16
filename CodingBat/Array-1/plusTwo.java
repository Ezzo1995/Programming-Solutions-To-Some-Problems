// Codingbat Array-1 problem : plusTwo   
// Problem Link: http://codingbat.com/prob/p180840

public int[] plusTwo(int[] a, int[] b)
{
  int[] result = new int[4];
  int i = 0;
    for(int j = 0; j < a.length; j++)
    {
      result[i] = a[j];
      i++;
    }
    for(int k = 0; k < b.length; k++)
    {
      result[i] = b[k];
      i++;
    }
  return result;
}