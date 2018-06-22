// Codingbat warmup-1 problem : missingChar
// Problem Link: http://codingbat.com/prob/p190570
public String missingChar(String str, int n) {
  if(n>=0 && n<=str.length())
    return str.replace(""+str.charAt(n),"");
  return "";
}