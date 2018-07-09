// Codingbat warmup-2 problem : doubleX  
// Problem Link: http://codingbat.com/prob/p186759

boolean doubleX(String str) 
{
  
  boolean result = false;
  
  for(int i=0; i<str.length()-1; i++)
  {
    
   if(str.charAt(i)=='x') 
   {
     if(str.charAt(i+1)=='x')
     {
        result = true;
     }
     else 
     {
      result = false;  
     }
     return result;
   }
   
  }
  
  return result;
}







