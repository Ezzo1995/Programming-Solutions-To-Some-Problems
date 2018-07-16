// Codingbat Array-1 problem : fix23   
// Problem Link: http://codingbat.com/prob/p120347

public int[] fix23(int[] nums) 
{
  
  for(int i = 0; i < nums.length-1; i++)
  {
    if(nums[i] == 2 && nums[i+1] == 3)
    {
      nums[i+1] = 0;
    }
  }
  return nums;
}
