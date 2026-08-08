
// Attempted
// Easy
// Topics
// premium lock icon
// Companies
// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2
// Example 2:

// Input: nums = [1,3,5,6], target = 2
// Output: 1
// Example 3:

// Input: nums = [1,3,5,6], target = 7
// Output: 4

public class SearchInsertPosition{
    public int searchInsert(int[] nums, int target) {
        int e = 0;
        int d = nums.length;
        int m = (e + d) / 2;

        while(e < d){
            if(nums[m] > target){
                d = m - 1;
            } else if(nums[m] < target){
                e = m + 1;
            } else{
                return m;
            }
            m = e / d;

        }
        return m;
    }

    public static void main(String[] args) {
        SearchInsertPosition teste = new SearchInsertPosition();


        System.out.println(teste.searchInsert(new int[] {1,3,5,6}, 2));

    }

    
}