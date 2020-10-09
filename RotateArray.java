class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length == 1){
            return;
        }
      
        int index = 0;
        while(index < k){
            int temp = nums[nums.length - 1];
  
            for(int i = nums.length - 1; i > 0 ; i--){
                nums[i] = nums[i - 1];
            }
            
            nums[0] = temp;
            
            index++;
        }
        
    }
}
