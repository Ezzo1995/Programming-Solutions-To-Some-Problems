// Codingbat Array-1 problem : sumLimit   
// Problem Link: http://codingbat.com/prob/p118077

public int sumLimit(int a, int b)
{
  String sum = String.valueOf(a+b);
  String aString = String.valueOf(a);
  
  if(sum.length() > aString.length())
  {
    return a;
  }
  return a+b;
}