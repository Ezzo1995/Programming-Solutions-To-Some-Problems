// Codingbat warmup-1 problem : mixStart
// Problem Link: http://codingbat.com/prob/p151713

public boolean mixStart(String str) {
  if(str.length()>=3 && str.substring(1,3).equals("ix")) return true;
  else return false;
}
