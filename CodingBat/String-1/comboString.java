// Codingbat String-1 problem : comboString   
// Problem Link: http://codingbat.com/prob/p168564

public String comboString(String a, String b) 
{
  if(a.length() < b.length())
  {
    return a + b + a;
  }
  return b + a + b;
}