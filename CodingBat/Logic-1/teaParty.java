// Codingbat Array-1 problem : teaParty   
// Problem Link: http://codingbat.com/prob/p177181

public int teaParty(int tea, int candy) 
{
  if(tea < 5 || candy < 5)
  {
    return 0;
  }
  if(tea >= 2*candy || candy >= 2*tea)
  {
    return 2;
  }
  if(tea >= 5 && candy >= 5)
  {
    return 1;
  }
  return 0;
}