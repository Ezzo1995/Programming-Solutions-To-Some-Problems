// Codingbat warmup-2 problem : stringSplosion   
// Problem Link: http://codingbat.com/prob/p117334

public String stringSplosion(String str) 
{
  String result = "";
  
  for(int i=0; i<str.length(); i++)
  {
    result += str.substring(0,i+1); 
  }
  
  return result;
}







