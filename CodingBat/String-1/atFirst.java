// Codingbat String-1 problem : atFirst   
// Problem Link: http://codingbat.com/prob/p139076

public String atFirst(String str)
{
  if(str.length() == 0)
  {
    return "@@";
  }
  else if(str.length() < 2)
  {
    return str + "@";
  }
  return str.substring(0,2);
}