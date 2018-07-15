// Codingbat String-1 problem : middleThree   
// Problem Link: http://codingbat.com/prob/p115863

public String middleThree(String str)
{
  int start = (str.length() / 2) - 1;
  return str.substring(start,start+3);  
}