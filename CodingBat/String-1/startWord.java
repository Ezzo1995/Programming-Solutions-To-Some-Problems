// Codingbat String-1 problem : startWord   
// Problem Link: http://codingbat.com/prob/p141494

public String startWord(String str, String word) 
{
  String result = "";
  if(str.length() >= word.length() && (str.substring(0,word.length()).equals(word) || str.substring(1,word.length()).equals(word.substring(1,word.length()))))
  {
    result = str.substring(0,word.length());
  }
  return result;
}