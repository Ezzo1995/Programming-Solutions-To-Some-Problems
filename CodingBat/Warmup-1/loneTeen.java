// Codingbat warmup-1 problem : loneTeen
// Problem Link: http://codingbat.com/prob/p165701

public boolean loneTeen(int a, int b)
{
  if( a>=13&&a<=19&&b>=13&&b<=19 || a==b) return false;
  return true;

}
