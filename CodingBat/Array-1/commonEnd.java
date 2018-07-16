// Codingbat Array-1 problem : commonEnd   
// Problem Link: http://codingbat.com/prob/p191991

public boolean commonEnd(int[] a, int[] b) 
{
  return a[0] == b[0] || a[a.length-1] == b[b.length-1];
}