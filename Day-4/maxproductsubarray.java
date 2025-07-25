/*Given an integer array nums, find a subarray that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

 

Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.*/
class maxproductsubarray {
    public int maxProduct(int[] nums) {
        int mxp=nums[0];
        int mnp=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp=mnp;
                mnp=mxp;
                mxp=temp;
            }
                mxp=Math.max(nums[i], mxp*nums[i]);
                mnp=Math.min(nums[i], mnp*nums[i]);
                res=Math.max(res,mxp);
            

        }
        return res;
    }
}