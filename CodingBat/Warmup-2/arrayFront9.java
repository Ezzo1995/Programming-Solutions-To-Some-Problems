// Codingbat warmup-2 problem : arrayFront9   
// Problem Link: http://codingbat.com/prob/p186031

public boolean arrayFront9(int[] nums)
{
  boolean found = false;
  if(nums.length>=4)
    {
    for(int i=0; i<4; i++)
      {
        if(nums[i] == 9)
           {
           found = true;
           }
       }
    }
  else 
  {
        for(int i=0; i<nums.length; i++)
      {
        if(nums[i] == 9)
           {
           found = true;
           }
       }
    }
    return found;
 }








