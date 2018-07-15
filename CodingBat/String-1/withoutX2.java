// Codingbat String-1 problem : withoutX2   
// Problem Link: http://codingbat.com/prob/p151359

public String withoutX2(String str) 
{
  if(str.length() < 2)
  {
    return "";
  }
  if(str.substring(0,2).equals("xx"))
  {
    return str.substring(2,str.length());
  }
  if(str.charAt(0) == 'x')
  {
    return str.substring(1,str.length());
  }
    if(str.charAt(1) == 'x')
  {
    return str.charAt(0) + str.substring(2,str.length());
  }
  return str;
}