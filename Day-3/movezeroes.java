/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 */
class movezeroes {
    static{
        for(int i =0;i<100;i++)
        moveZeroes(new int[]{0,0});
    }

    public static void moveZeroes(int[] nums) {
        int i = 0 ;
        int j = 0 ;
        while(i<nums.length){
            if(nums[i] == 0){
                i++;
            }
            else{
                nums[j] = nums[i];
                i++;
                j++;
            }
        }
        while(j<nums.length){
            nums[j] = 0;
            j++;
        }
        

    }
}