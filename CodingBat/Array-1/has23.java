// Codingbat Array-1 problem : has23   
// Problem Link: http://codingbat.com/prob/p171022

public boolean has23(int[] nums) 
{
  for(int i = 0; i < nums.length; i++)
  {
    if(nums[i] == 2 || nums[i] == 3)
    {
      return true;
    }
  }
  return false;
}

