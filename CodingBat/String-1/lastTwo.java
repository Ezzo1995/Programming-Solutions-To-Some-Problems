// Codingbat String-1 problem : lastTwo   
// Problem Link: http://codingbat.com/prob/p194786

public String lastTwo(String str)
{
  if(str.length() < 2)
  {
    return str;
  }
  return str.substring(0,str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2);
}
