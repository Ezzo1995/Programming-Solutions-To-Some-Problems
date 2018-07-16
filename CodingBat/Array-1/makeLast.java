// Codingbat Array-1 problem : makeLast   
// Problem Link: http://codingbat.com/prob/p137188

public int[] makeLast(int[] nums) 
{
  int[] result = new int[nums.length * 2];
  result[result.length - 1] = nums[nums.length - 1];
  return result;
}
