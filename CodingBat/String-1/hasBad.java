// Codingbat String-1 problem : hasBad   
// Problem Link: http://codingbat.com/prob/p139075

public boolean hasBad(String str)
{
  if(str.length()<3 || (str.length() == 3 && !str.equals("bad")))
  {
    return false;
  }
  return  str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad");
}