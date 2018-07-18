// Codingbat Array-1 problem : withoutDoubles   
// Problem Link: http://codingbat.com/prob/p115233

public int withoutDoubles(int die1, int die2, boolean noDoubles)
{
  if(noDoubles)
  {
    if(die1 == die2)
    {
      if(die1 == 6)
      {
        return die1+1;
      }
      die1++;
    }  
  }
  return die1 + die2;
}