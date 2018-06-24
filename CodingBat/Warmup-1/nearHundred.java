// Codingbat warmup-1 problem : nearHundred
// Problem Link: http://codingbat.com/prob/p184004

public boolean nearHundred(int n) 
{
  int diff100 = Math.abs(n-100);  
  int diff200 = Math.abs(n-200);
  
  return diff100<=10 || diff200<=10;
}





