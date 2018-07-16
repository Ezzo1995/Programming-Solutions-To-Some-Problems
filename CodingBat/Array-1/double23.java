// Codingbat Array-1 problem : double23   
// Problem Link: http://codingbat.com/prob/p145365

public boolean double23(int[] nums) 
{
  int count2 = 0;
  int count3 = 0;
  
  if(nums.length < 2)
  {
    return false;
  }
  
  for(int i = 0; i < nums.length; i++)
  {
    if(nums[i] == 2)
    {
      count2++;
    }
    if(nums[i] == 3)
    {
      count3++;
    }
  }
  if(count2 == 2 || count3 == 2)
  {
    return true;
  }
  return false;
}
