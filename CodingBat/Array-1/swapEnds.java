// Codingbat Array-1 problem : swapEnds   
// Problem Link: http://codingbat.com/prob/p118044

public int[] swapEnds(int[] nums)
{
  int[] result = new int[nums.length];
  result[0] = nums[nums.length - 1];
  result[result.length - 1] = nums[0];
  
  for(int i = 1; i < nums.length-1; i++)
  {
    result[i] = nums[i];
  }
  return result;
}