// Codingbat Array-1 problem : cigarParty   
// Problem Link: http://codingbat.com/prob/p159531

public boolean cigarParty(int cigars, boolean isWeekend)
{
  if(!isWeekend)
  {
     return (cigars >= 40 && cigars <= 60);
  }
  if(isWeekend && cigars >= 40)
  {
    return true;
  }
  return false;
}