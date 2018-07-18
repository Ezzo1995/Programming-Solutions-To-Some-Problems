// Codingbat Array-1 problem : old35   
// Problem Link: http://codingbat.com/prob/p159612

public boolean old35(int n) 
{
  return (n % 3 == 0 && !(n % 5 == 0)) || (n % 5 == 0 && !(n % 3 == 0));  
}