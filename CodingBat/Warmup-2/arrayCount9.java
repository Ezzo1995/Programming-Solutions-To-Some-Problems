// Codingbat warmup-2 problem : arrayCount9   
// Problem Link: http://codingbat.com/prob/p184031

public int arrayCount9(int[] nums)
{
  int count = 0;
  for(int i=0; i<nums.length; i++)
  {
    if(nums[i] == 9)
    {
      count++;
    }
  }
  return count;
}








