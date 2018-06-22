// Codingbat warmup-1 problem : backAround
// Problem Link: http://codingbat.com/prob/p161642
public String backAround(String str) {
  if(str.length()>=1)
    return str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
  return str;
}

