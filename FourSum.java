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
        int soma = 0;
        int somaLista = 0;
        
        for(int i = 0; i < nums.length; i++){
            int x = i;
            while (x < nums.length) { 
                soma += nums[x];
                System.out.println("Soma: " + soma + " += " + nums[x]);
                System.out.println();
                if(soma <= target && numeros.size() <= 4){
                    numeros.add(nums[x]);
                } else {
                    soma -= nums[x];
                }
                System.out.println(numeros);

                if(numeros.size() == 4){
                    for(int n : numeros){
                        somaLista += n;
                    }
                    if(somaLista == target){
                        listaCerta.add(new ArrayList<>(numeros));
                    }
                    somaLista = 0;
                    numeros = new ArrayList<>();
            
                }
                x+=1;
                
            }
            soma = 0;
        }
        return listaCerta;
    }
    
    public static void main (String[] args) {
        FourSum teste = new FourSum();
        
        System.out.print(teste.fourSum(new int[] {1,0,-1,0,-2,2}, 0));
    }
}

            // int a = nums[i];
            // int b = nums[(i + 1) % nums.length];
            // int c = nums[(i + 2) % nums.length];
            // int d = nums[(i + 3) % nums.length];

            // numeros.add(a);
            // numeros.add(b);
            // numeros.add(c);
            // numeros.add(d);

            //             soma = 0;
            // for (int n : numeros){
            //     soma += n;
            // }

            // if(soma == target){
            //     listaCerta.add(new ArrayList<>(numeros));
            //     numeros = new ArrayList<>();
            //     soma = 0;
            // }