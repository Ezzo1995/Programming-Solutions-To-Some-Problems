// Codingbat String-1 problem : without2   
// Problem Link: http://codingbat.com/prob/p142247

public String without2(String str)
{
  String result = "";
  
  if(str.length() < 2)
  {
    return str;
  }
  
  if(str.substring(0,2).equals(str.substring(str.length()-2,str.length())))
  {
    return str.substring(2,str.length());
  }
  
  return str;
}
