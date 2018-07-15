// Codingbat String-1 problem : deFront   
// Problem Link: http://codingbat.com/prob/p110141

public String deFront(String str) 
{    
  if(str.substring(0,2).equals("ab"))
  {
    return str;
  }
  if(str.charAt(0) == 'a')
  {
    return str.charAt(0) + str.substring(2,str.length());
  }
  if(str.charAt(1) == 'b')
  {
    return str.charAt(1) + str.substring(2,str.length());
  }
  return str.substring(2,str.length());
}