// Codingbat Array-1 problem : maxEnd3   
// Problem Link: http://codingbat.com/prob/p146256

public int[] maxEnd3(int[] nums)
{
  int[] result = new int[3];
  int bigger = nums[0];
  
  if(nums[nums.length - 1] > bigger)
  {
    bigger = nums[nums.length - 1];
  }
  
  for(int i = 0; i < nums.length; i++)
  {
    result[i] = bigger;
  }
  
  return result;
}