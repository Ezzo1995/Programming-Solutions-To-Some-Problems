// Codingbat Array-1 problem : reverse3   
// Problem Link: http://codingbat.com/prob/p112409

public int[] reverse3(int[] nums) 
{
  int[] result = new int[3];
  int j = 0;
  for(int i = nums.length-1; i >= 0; i-- )
  {
    result[j] = nums[i];
    j++;
  }
  return result;
}