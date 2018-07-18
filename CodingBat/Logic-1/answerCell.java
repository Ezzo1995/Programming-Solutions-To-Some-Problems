// Codingbat Array-1 problem : answerCell   
// Problem Link: http://codingbat.com/prob/p110973

public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) 
{
  if(isMorning)
  {
    if(isMom)
    {
      if(isAsleep)
      {
        return false;
      }
      return true;
    }
    return false;
  }
  
  if(isAsleep)
  {
    return false;
  }
  return true;
}