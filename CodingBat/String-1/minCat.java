// Codingbat String-1 problem : minCat   
// Problem Link: http://codingbat.com/prob/p105745

public String minCat(String a, String b)
{
  int diff = Math.abs(a.length() - b.length());
  
  if(a.length() == 0 && b.length() == 0)
  {
    return "";
  }
  
  if(b.length() < a.length())
  {
    return a.substring(diff , a.length()) + b;
  }
  
  if(a.length() < b.length())
  {
    return a + b.substring(diff, b.length());
  }
  
  return a + b;
}
