// Codingbat warmup-1 problem : everyNth
// Problem Link: http://codingbat.com/prob/p196441

public String everyNth(String str, int n) 
{
  String result="";
 for(int i=0; i<str.length(); i+=n) 
 {
  result += str.charAt(i); 
 }
 return result;
}



