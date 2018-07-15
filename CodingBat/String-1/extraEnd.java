// Codingbat String-1 problem : extraEnd   
// Problem Link: http://codingbat.com/prob/p108853

public String extraEnd(String str) 
{
  if(str.length() == 2)
  {
    return str + str + str;
  }
  
  String last2 = str.substring(str.length()-2,str.length());
  return last2 + last2 + last2;
}