// Enunciado original:
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// Enunciado traduzido:
// Dado um array de inteiros `nums` e um inteiro `target`, retorne os índices dos dois números cuja soma seja igual a `target`.
// Você pode assumir que cada entrada terá exatamente uma solução e não pode usar o mesmo elemento duas vezes.
// Você pode retornar a resposta em qualquer ordem.

import java.util.ArrayList;
import java.util.List;

public class TwoSum{
     
    public List<Integer> indicesSoma(int target){
        List<Integer> nums = List.of(3, 3);
        List<Integer> indices = new ArrayList<>();
        for(int i = 0; i < nums.size(); i++){
            for(int j = i + 1; j < nums.size(); j++){
                if(nums.get(i) + nums.get(j) == target){
                    indices.add(i);
                    indices.add(j);
                }
            }
        }       
        return indices;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
    
        System.out.println(twoSum.indicesSoma(6));
    }

    
}
