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
import java.util.List;

class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<Integer> numeros = new ArrayList<>();
        List<List<Integer>> listaCerta = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){    
            int direita = nums.length - 1;
            int esquerda = i + 2;
            for(int j = i + 1; j < nums.length; j++){
                int soma = nums[i] + nums[j];
                int sobra = soma - target;
                while(sobra != target || esquerda != direita){
                    if(sobra )

                }


            }
        }
        return listaCerta;
    }
    
    public static void main (String[] args) {
        FourSum teste = new FourSum();
        
        System.out.print(teste.fourSum(new int[] {3,2,1,4,3,25,6,5,3,4,1,2,3,5,3,2,3,4,65,6,3,2}, 7));
    }
}

// for(int k = j + 1; k < nums.length; k++){
//                     for(int l = k + 1; l < nums.length; l++){
//                         if((nums[i] + nums[j] + nums[k] + nums[l]) == target){
//                             numeros.addAll(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
//                             Collections.sort(numeros);
//                             if(!listaCerta.contains(numeros)){
//                                 listaCerta.add(new ArrayList<>(numeros));
//                             }
//                             numeros = new ArrayList<>();
//                         }
//                     }
//                 }