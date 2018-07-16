// Codingbat Array-1 problem : maxTriple   
// Problem Link: http://codingbat.com/prob/p185176

public int maxTriple(int[] nums)
{
  int max = nums[0];
  
  if(nums[nums.length - 1] > max)
  {
    if(nums[nums.length - 1] > nums[nums.length/2])
    {
       max = nums[nums.length - 1];
    }
  }
  
  if(nums[nums.length/2] > max)
  {
    max = nums[nums.length/2];
  }
  
  return max;
}