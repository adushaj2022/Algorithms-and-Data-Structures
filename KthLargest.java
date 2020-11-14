class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for(int num : nums) {
            maxHeap.add(num);
        }
        
        int res = -1;
        for(int i = 0; i < k; ++i){
            res = maxHeap.poll();
        }
        
        return res;
    }
}
