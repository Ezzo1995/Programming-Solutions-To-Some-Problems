// Codingbat warmup-2 problem : last2   
// Problem Link: http://codingbat.com/prob/p178318

public int last2(String str)
{
  int count = 0;
  
  for(int i=0; i<str.length()-2; i++)
  {
    String two = str.substring(i, i+2);
    
    if(two.equals(str.substring(str.length()-2)))
    {
      count++;
    }
  }
  return count;
}







