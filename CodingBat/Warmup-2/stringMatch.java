// Codingbat warmup-2 problem : stringMatch   
// Problem Link: http://codingbat.com/prob/p198640

public int stringMatch(String a, String b)
{
  int count = 0;
  int size = 0;
  
  if(a.length() < b.length())
  {
    size = a.length();
  }
  else
  {
    size = b.length();
  }
  
  if(size<2)
  {
    count = 0;
  }
  else
  {
  for(int i =0; i<size-1; i++)
  {
    if(a.charAt(i) == b.charAt(i) && a.charAt(i+1) == b.charAt(i+1))
    {
      count++;
    }
  }
  }
  return count;
}
