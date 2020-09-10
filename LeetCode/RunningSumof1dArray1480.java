class Solution {
    public int[] runningSum(int[] nums) {
    int auxiliar=0;
		int [] vector_respuesta=new int[nums.length];
		vector_respuesta[0]=nums[0];
		for (int i = 1; i < nums.length; i++) {
			auxiliar=auxiliar+nums[i-1];
			vector_respuesta[i]=nums[i]+auxiliar;
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i]=vector_respuesta[i];
		}
    	return nums;
    }
}
