// Codingbat warmup-1 problem : front3
// Problem Link: http://codingbat.com/prob/p136351
public String front3(String str) {
  
  String tmp = "";
  if(str.length()<=3 ) 
  {
    for(int i = 0; i<3; i++)
      tmp+=str;
  }
  else 
  {
    for(int i = 0; i<3; i++)
      tmp+=str.substring(0,3);
  }
  return tmp;
  
}
