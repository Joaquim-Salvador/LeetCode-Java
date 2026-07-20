// Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

// 0 <= a, b, c, d < n
// a, b, c, and d are distinct.
// nums[a] + nums[b] + nums[c] + nums[d] == target
// You may return the answer in any order.

 

// Example 1:

// Input: nums = [1,0,-1,0,-2,2], target = 0
// Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
// Example 2:

// Input: nums = [2,2,2,2,2], target = 8
// Output: [[2,2,2,2]]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> listaCerta = new ArrayList<>();
        int direita = nums.length - 1;

        for(int i = 0; i < nums.length; i++){    
            for(int j = i + 1; j < nums.length; j++){
                int esquerda = j + 1;
                int soma = nums[i] + nums[j];
                int sobra = target - soma;
                while(esquerda < direita){
                    if((nums[direita] + nums[esquerda]) < sobra){
                        esquerda += 1;
                    }
                    else if((nums[direita] + nums[esquerda]) > sobra){
                        direita -= 1;
                    }

                    if((nums[direita] + nums[esquerda]) == sobra){
                        listaCerta.add(Arrays.asList(nums[i], nums[j], nums[direita], nums[esquerda]));
                        direita--;
                        esquerda++;

                        while(nums[esquerda] == nums[esquerda - 1] || nums[direita] == nums[direita + 1]){
                            if(nums[direita] == nums[direita + 1]){
                                direita--;
                            }
                            else if (nums[esquerda] == nums[esquerda - 1]){
                                esquerda++;
                            }
                        }
                    }
                }
                esquerda = j + 1;
                direita = nums.length - 1;
            }
        }
        return listaCerta;
    }
    
    public static void main (String[] args) {
        FourSum teste = new FourSum();
        
        System.out.print(teste.fourSum(new int[] {2,2,2,2,2}, 8));
    }
}
