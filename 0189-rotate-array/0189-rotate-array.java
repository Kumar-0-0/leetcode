class Solution {
    public void rotate(int[] nums, int k) {
   if (k==0) return;
   if (nums == null || nums.length == 0) return;
   
   int[] res = new int[nums.length];
   for (int i=0; i<nums.length; i++) {
      int newIndex = (i + k) % nums.length;
      res[newIndex] = nums[i];
   }
   
   //assign back to original array
   for (int i=0; i<nums.length; i++) {
      nums[i] = res[i];
   }
}
}