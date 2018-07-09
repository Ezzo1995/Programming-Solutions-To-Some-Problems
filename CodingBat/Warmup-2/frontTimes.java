// Codingbat warmup-2 problem : frontTimes 
// Problem Link: http://codingbat.com/prob/p101475

public String frontTimes(String str, int n)
{

  String result = "";
  if(str.length()<3)
  {
    for(int i=0; i<n; i++)
    {
      result += str;
    }

  }
  else
  {
    String front = str.substring(0,3);
    for(int i=0; i<n; i++)
    {
      result += front;
    }
  }
  
  return result;
}






