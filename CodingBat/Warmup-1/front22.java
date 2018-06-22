// Codingbat warmup-1 problem : front22
// Problem Link: http://codingbat.com/prob/p183592
public String front22(String str) 
{
  
  if(str.length()<2)
    return str + str + str;
  else
  {
    String front = str.substring(0,2);
    return front + str + front;
  }
  
}

