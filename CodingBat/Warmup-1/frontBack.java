// Codingbat warmup-1 problem : frontBack
// Problem Link: http://codingbat.com/prob/p123384
public String frontBack(String str) {
  if(str.length() == 1 || str.length()==0) return str;
  return str.charAt(str.length()-1) + str.substring(1,str.length()-1) + str.charAt(0);
}