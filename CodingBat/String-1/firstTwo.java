// Codingbat String-1 problem : firstTwo   
// Problem Link: http://codingbat.com/prob/p163411

public String firstTwo(String str) 
{
  if(str.length() <= 2)
  {
    return str;
  }
  return str.substring(0,2);
}