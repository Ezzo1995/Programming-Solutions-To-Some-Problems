// Codingbat warmup-2 problem : altPairs   
// Problem Link: http://codingbat.com/prob/p121596
public String altPairs(String str) 
{
  String result = "";
  if(str.length() < 3)
  {
    return str;
  }
  for(int i = 0; i<str.length(); i+=4)
  {
    int end = i+2;
    if(end > str.length())
    {
      end = str.length();
    }
    result += str.substring(i,end);
  }
  return result;
}
