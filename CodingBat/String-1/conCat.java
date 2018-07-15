// Codingbat String-1 problem : conCat   
// Problem Link: http://codingbat.com/prob/p132118

public String conCat(String a, String b)
{
  String result = "";
  if(a.length() == 0)
  {
    return b;
  }
  if(b.length() == 0)
  {
    return a;
  }
  
  if(a.charAt(a.length() - 1) == b.charAt(0))
  {
    result = a.substring(0,a.length()-1) + b;
  }
  else
  {
    result = a + b;
  }
  return result;
}