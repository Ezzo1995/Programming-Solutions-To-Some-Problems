// Codingbat warmup-1 problem : endUp
// Problem Link: http://codingbat.com/prob/p125268

public String endUp(String str) 
{
  if(str.length()>3) {
    String last3Upp = str.substring(str.length()-3,str.length()).toUpperCase();
    return str.substring(0,str.length()-3)+last3Upp;
  }
  else return str.toUpperCase();
}



