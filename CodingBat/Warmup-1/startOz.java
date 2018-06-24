// Codingbat warmup-1 problem : startOz
// Problem Link: http://codingbat.com/prob/p199720

public String startOz(String str) 
{
  if(str.length()<2) return str;
  boolean o = str.charAt(0)=='o';
  boolean z = str.charAt(1)=='z';
  if(o&&z) return str.substring(0,2);
  else if(o&&!z) return str.charAt(0)+"";
  else if(z&&!o) return str.charAt(1)+"";
  else return "";
}
