// Codingbat warmup-1 problem : max1020
// Problem Link: http://codingbat.com/prob/p177372

public int max1020(int a, int b)
{
  boolean ainRange = a>=10 && a<=20;
  boolean binRange = b>=10 && b<=20;
  
  if(ainRange && binRange){
    if(a>b) return a;
    else return b;
  }
  else if(ainRange && !binRange) return a;
  else if(!ainRange && binRange) return b;
  else return 0;
}

