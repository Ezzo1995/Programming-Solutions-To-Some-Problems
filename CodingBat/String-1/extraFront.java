// Codingbat String-1 problem : extraFront   
// Problem Link: http://codingbat.com/prob/p172063

public String extraFront(String str) 
{
  String result = "";
  if(str.length() < 2)
  {
    for(int i = 0; i < 3; i++)
    {
      result += str;   
    }
    return result;
  }
  
  for(int i = 0; i < 3; i++)
  {
      result += str.substring(0,2);
  }
    return result;
  
}