package neetcode;
public class Solution {
    public int removeElement(int[] nums, int val) {

        int k =0;

        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;

            }
           
        }
        return k;
    
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int arr []={3,2,2,3};
        System.out.println(s.removeElement(arr,3));
    
    }
} 
