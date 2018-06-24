// Codingbat warmup-1 problem : startHi
// Problem Link: http://codingbat.com/prob/p191022
public boolean startHi(String str) {
  
  if(str.length()<2) return false;
  else if(str.substring(0,2).equalsIgnoreCase("hi"))
  {
      return true;
  } 
  return false;
}

