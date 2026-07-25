// 26. Remove Duplicates from Sorted Array

// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

// Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, return the number of unique elements k.

// The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.

// Custom Judge:

// The judge will test your solution with the following code:

// int[] nums = [...]; // Input array
// int[] expectedNums = [...]; // The expected answer with correct length

// int k = removeDuplicates(nums); // Calls your implementation

// assert k == expectedNums.length;
// for (int i = 0; i < k; i++) {
//     assert nums[i] == expectedNums[i];
// }

import java.util.Arrays;

public class RemoveDuplicates{
    public int removeDuplicates(int[] nums){
        int k = 0;

        if (nums.length == 0) {
            return 0;
        }

        for(int i = 0; i < nums.length; i ++){
            if(nums[i] != nums[k]){
                nums[k + 1] = nums[i];
                k++;
            }    
        }
        System.out.println(Arrays.toString(nums));
        return k + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicates teste = new RemoveDuplicates();
    
        System.out.println(teste.removeDuplicates(new int[] {1,1,2}));
    }
}