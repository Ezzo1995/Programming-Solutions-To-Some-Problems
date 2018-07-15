// Codingbat String-1 problem : nTwice   
// Problem Link: http://codingbat.com/prob/p174148

public String nTwice(String str, int n) 
{
  return str.substring(0,n) + str.substring(str.length()-n,str.length());
}