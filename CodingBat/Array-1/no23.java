// Codingbat Array-1 problem : no23   
// Problem Link: http://codingbat.com/prob/p175689

public boolean no23(int[] nums) 
{
  for(int i = 0; i < nums.length; i++)
  {
    if(nums[i] == 2 || nums[i] == 3)
    {
      return false;
    }
  }
  return true;
}
