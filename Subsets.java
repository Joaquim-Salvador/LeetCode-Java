// 78. Subsets
// Medium

// Given an integer array nums of unique elements, return all possible subsets (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.

// Example 1:

// Input: nums = [1,2,3]
// Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
// Example 2:

// Input: nums = [0]
// Output: [[],[0]]

import java.util.ArrayList;
import java.util.List;

public class Subsets{
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> listaFinal = new ArrayList<>();
        List<Integer> subLista = new ArrayList();

        for(int i = 0; i < nums.length; i++){
            int esquerda = i;
            subLista = new ArrayList<>();

            while(esquerda <  nums.length){
                subLista.add(nums[esquerda]);
                listaFinal.add(new ArrayList<>(subLista));
            
                esquerda++;  
            }
        }
        listaFinal.add(new ArrayList<>());
        return listaFinal;
        }
        
   


    public static void main(String[] args) {
        Subsets teste = new Subsets();

        System.out.println(teste.subsets(new int[] {1,2,3}));
    }

} 