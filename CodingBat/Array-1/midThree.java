// Codingbat Array-1 problem : midThree   
// Problem Link: http://codingbat.com/prob/p155713

public int[] midThree(int[] nums)
{
  int[] result = new int[] {nums[nums.length/2 - 1], nums[nums.length/2], nums[nums.length/2 + 1]};
  return result;
}