class Solution {
    public int[] productExceptSelf(int[] nums) {
     int[] arrLeft= new int[nums.length];
     int[] arrRight= new int[nums.length];
     int[] ans=new int[nums.length];

     arrLeft[0]=nums[0];
     arrRight[nums.length-1]=nums[nums.length-1];
     for(int i=1;i<nums.length;i++)
     {
        arrLeft[i]=nums[i]*arrLeft[i-1];
     }
      for(int i=nums.length-2;i>=0;i--)
     {
        arrRight[i]=nums[i]*arrRight[i+1];
     }
     ans[0]=arrRight[1];
     ans[nums.length-1]=arrLeft[nums.length-2];

     for(int i=1;i<nums.length-1;i++)
     {
       ans[i]=arrRight[i+1]*arrLeft[i-1];
     }
      return ans;
    }
}
