// Codingbat Array-1 problem : makeMiddle   
// Problem Link: http://codingbat.com/prob/p199519

public int[] makeMiddle(int[] nums) 
{
  int[] result = new int[] {nums[(nums.length/2) - 1] ,nums[nums.length/2] };
  return result;
}
