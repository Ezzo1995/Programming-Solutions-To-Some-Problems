// Codingbat String-1 problem : lastChars   
// Problem Link: http://codingbat.com/prob/p138183

public String lastChars(String a, String b) 
{
  if(a.length() == 0)
  {
    a = "@";
  }
  if(b.length() == 0)
  {
    b = "@";
  }
  return a.charAt(0) + "" + b.charAt(b.length()-1);
}
