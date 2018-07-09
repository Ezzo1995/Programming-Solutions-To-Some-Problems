// Codingbat warmup-2 problem : stringBits   
// Problem Link: http://codingbat.com/prob/p165666

public String stringBits(String str)
{
  String result = "";
  
  for(int i=0; i<str.length(); i+=2)
  {
    result += str.charAt(i);
  }
  
  return result;
}







