// Codingbat String-1 problem : theEnd   
// Problem Link: http://codingbat.com/prob/p162477

public String theEnd(String str, boolean front)
{
  if(front == true)
  {
    return str.charAt(0) + "";
  }
  return str.charAt(str.length()-1) + "";
}