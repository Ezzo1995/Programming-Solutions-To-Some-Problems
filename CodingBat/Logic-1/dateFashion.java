// Codingbat Array-1 problem : dateFashion   
// Problem Link: http://codingbat.com/prob/p103360

public int dateFashion(int you, int date) 
{
  if(you <= 2 || date <= 2)
  {
    return 0;
  }
  if( you >= 8 || date >= 8)
  {
    return 2;
  }
    return 1;
}