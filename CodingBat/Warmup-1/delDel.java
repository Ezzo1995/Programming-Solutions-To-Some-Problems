// Codingbat warmup-1 problem : delDel
// Problem Link: http://codingbat.com/prob/p100905

public String delDel(String str) {
  if(str.length()<=3) return str;
  else if(str.substring(1,4).equals("del")) return str.charAt(0)+str.substring(4,str.length());
  else return str;
}