// Codingbat String-1 problem : twoChar   
// Problem Link: http://codingbat.com/prob/p144623

public String twoChar(String str, int index) 
{
  if(index<0 || index+2 > str.length())
  {
    return str.substring(0,2);
  }
  return str.substring(index,index+2);
}