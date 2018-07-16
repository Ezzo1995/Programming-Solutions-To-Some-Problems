// Codingbat Array-1 problem : frontPiece   
// Problem Link: http://codingbat.com/prob/p142455

public int[] frontPiece(int[] nums) 
{
  int[] result = new int[2];
  if(nums.length <= 2) 
  {
    return nums;
  }
  result[0] = nums[0];
  result[1] = nums[1];
  
  return result;
}
