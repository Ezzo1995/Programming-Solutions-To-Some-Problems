// Codingbat String-1 problem : endsLy   
// Problem Link: http://codingbat.com/prob/p103895

public boolean endsLy(String str)
{
  if(str.length() <= 1)
  {
    return false;
  }
  return str.substring(str.length()-2,str.length()).equals("ly");
}