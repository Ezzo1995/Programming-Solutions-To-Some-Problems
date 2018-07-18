// Codingbat Array-1 problem : fizzString   
// Problem Link: http://codingbat.com/prob/p137136

public String fizzString(String str) 
{
  if(str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b')
  {
    return "FizzBuzz";
  }
  if(str.charAt(0) == 'f')
  {
    return "Fizz";
  }
  if(str.charAt(str.length() - 1) == 'b')
  {
    return "Buzz";
  }
  return str;
}