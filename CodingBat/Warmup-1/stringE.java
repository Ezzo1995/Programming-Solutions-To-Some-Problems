// Codingbat warmup-1 problem : stringE
// Problem Link: http://codingbat.com/prob/p173784

public boolean stringE(String str)
{
  int eCount = 0;
  for(int i = 0; i<str.length(); i++)
  {
    if(str.charAt(i)=='e') eCount++;
  }
    if(eCount>=1&&eCount<=3) return true;
    return false;
}


