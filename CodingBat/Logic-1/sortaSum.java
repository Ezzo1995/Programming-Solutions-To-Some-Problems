// Codingbat Array-1 problem : sortaSum   
// Problem Link: http://codingbat.com/prob/p183071

public int sortaSum(int a, int b) 
{
  int sum = a + b;
  if(sum >= 10 && sum <= 19)
  {
    return 20;
  }
  return sum;
}