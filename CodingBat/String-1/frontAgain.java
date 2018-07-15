// Codingbat String-1 problem :  frontAgain   
// Problem Link: http://codingbat.com/prob/p196652

public boolean frontAgain(String str)
{
  if(str.length() < 2)
  {
    return false;
  }
  if(str.substring(0,2).equals(str.substring(str.length()-2,str.length())))
  {
    return true;
  }
  return false;
}