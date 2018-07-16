// Codingbat Array-1 problem : rotateLeft3   
// Problem Link: http://codingbat.com/prob/p185139

public int[] rotateLeft3(int[] nums) 
{
  int[] result = new int[3];
  int j = 0;
  for(int i = 1; i < nums.length; i++)
  {
    result[j] = nums[i];
    j++;
  }
  result[j] = nums[0];
  return result;
}