// Codingbat warmup-2 problem : stringX   
// Problem Link: http://codingbat.com/prob/p171260

public String stringX(String str) 
{
  String result = "";
  for (int i=0; i<str.length(); i++) {
   
    if (!(i > 0 && i < (str.length()-1) && str.charAt(i) == 'x')) {
      result = result + str.charAt(i)+""; 
    }
  }
  return result;
}
