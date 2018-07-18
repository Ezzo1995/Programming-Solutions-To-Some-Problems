// Codingbat Array-1 problem : squirrelPlay   
// Problem Link: http://codingbat.com/prob/p141061

public boolean squirrelPlay(int temp, boolean isSummer) 
{
  if(!isSummer)
  {
    return temp >= 60 && temp <= 90;
  }
  if(isSummer)
  {
    return temp >= 60 && temp <= 100;
  }
  return false;
}